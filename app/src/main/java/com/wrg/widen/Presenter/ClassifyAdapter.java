package com.wrg.widen.Presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.wrg.widen.Model.ClassifyEntity;
import com.wrg.widen.R;
import com.wrg.widen.Util.BannerviewHodler;
import com.wrg.widen.Util.VideoViewHodler;
import com.wrg.widen.View.ClassifyDetailActivity;
import com.wrg.widen.View.DetailActivity;

import java.util.ArrayList;
import java.util.List;

import static android.support.v7.widget.LinearLayoutManager.HORIZONTAL;

/**
 * Created by 翁 on 2017/9/7.
 */

public class ClassifyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;

    private List<ClassifyEntity.ItemListBeanX> datas;

    //private RecyclerView.RecycledViewPool viewPool;

    private SqureClassifyAdapter squreClassifyAdapter;

    public ClassifyAdapter(Context context) {
        this.context = context;
        datas = new ArrayList<>();

    }

    public void setDatas(List<ClassifyEntity.ItemListBeanX> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    public void addDatas(List<ClassifyEntity.ItemListBeanX> datas) {
        this.datas.addAll(datas);
        this.notifyDataSetChanged();
    }
   /* public ClassifyAdapter(List<ClipData.Item> items) {
        //Constructor stuff
        viewPool = new RecyclerView.RecycledViewPool();
    }*/
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;


        switch (viewType) {
            case 1:
                View view = LayoutInflater.from(context).inflate(R.layout.layout_classify_square, parent, false);
                viewHolder = new squareViewHolder(view);
                break;

            case 2:
                View bannerView = LayoutInflater.from(context).inflate(R.layout.layout_classify_banner, parent, false);
                viewHolder = new bannerViewHolder(bannerView);

                break;
            case 3:

                View videoView = LayoutInflater.from(context).inflate(R.layout.layout_classify_video, parent, false);
                viewHolder = new videoViewHolder(videoView);
                break;


        }


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final List<ClassifyEntity.ItemListBeanX.DataBeanX.ItemListBean> itemList = datas.get(position).getData().getItemList();
        if (holder instanceof squareViewHolder) {
            squreClassifyAdapter = new SqureClassifyAdapter(context);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.setOrientation(HORIZONTAL);
            ((squareViewHolder) holder).recyclerView.setLayoutManager(linearLayoutManager);
            squreClassifyAdapter.setDatas(itemList);

            //((squareViewHolder) holder).recyclerView.setRecycledViewPool(viewPool);

            ((squareViewHolder) holder).squre_title.setText(datas.get(position).getData().getHeader().getTitle());

            ((squareViewHolder) holder).recyclerView.setAdapter(squreClassifyAdapter);
            //点击跳到分类的详情的页面
            squreClassifyAdapter.setmListener(new SqureClassifyAdapter.MyItemClickListener() {
                @Override
                public void doOnSuccessClick(View view, int position) {
                    ClassifyEntity.ItemListBeanX.DataBeanX.ItemListBean.DataBean data = itemList.get(position).getData();
                    String id = data.getId();
                    Intent intent=new Intent(context, ClassifyDetailActivity.class);
                    intent.putExtra("squre_id",id);
                    context.startActivity(intent);
                }
            });

        } else if (holder instanceof bannerViewHolder) {
            ((bannerViewHolder) holder).banner_title.setText(datas.get(position).getData().getHeader().getTitle());
            ((bannerViewHolder) holder).convenienBanner.setPages(new CBViewHolderCreator() {
                @Override
                public Object createHolder() {
                    return new BannerviewHodler();
                }
            }, itemList).setPageIndicator(new int[]{R.mipmap.point_grey, R.mipmap.point_black})
                    .setPointViewVisible(true).setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(int position) {



                }
            });

        } else if (holder instanceof videoViewHolder) {
            ((videoViewHolder) holder).video_convenientBanner.setPages(new CBViewHolderCreator() {
                @Override
                public Object createHolder() {
                    return new VideoViewHodler();
                }
            }, itemList).setPageIndicator(new int[]{R.mipmap.point_grey, R.mipmap.point_black})
                    .setPointViewVisible(true).setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(int position) {
                    ClassifyEntity.ItemListBeanX.DataBeanX.ItemListBean itemListBean = itemList.get(position);
                    String playUrl = itemListBean.getData().getPlayUrl();
                    String title = itemListBean.getData().getTitle();
                    String category = itemListBean.getData().getCategory();
                    String id = itemListBean.getData().getId();
                    String description = itemListBean.getData().getDescription();
                    String image = itemListBean.getData().getCover().getDetail();
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("id",id);
                    intent.putExtra("description",description);
                    intent.putExtra("category",category);
                    intent.putExtra("url", playUrl);
                    intent.putExtra("title", title);
                    intent.putExtra("img",image);
                    context.startActivity(intent);
                }
            });

            ((videoViewHolder) holder).video_title.setText(datas.get(position).getData().getHeader().getTitle());
            ((videoViewHolder) holder).video_description.setText(datas.get(position).getData().getHeader().getSubTitle());
        }
    }

    @Override
    public int getItemViewType(int position) {
        String type = datas.get(position).getType();
        switch (type) {
            case "squareCardCollection":

                return 1;
            case "bannerCollection":

                return 2;
            case "videoCollectionOfHorizontalScrollCard":

                return 3;
        }

        return 0;
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


    class squareViewHolder extends RecyclerView.ViewHolder {
        TextView squre_title;
        RecyclerView recyclerView;

        public squareViewHolder(View itemView) {
            super(itemView);
            squre_title = (TextView) itemView.findViewById(R.id.text_squre_title);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recyclerView_squre);
        }
    }

    class bannerViewHolder extends RecyclerView.ViewHolder {
        TextView banner_title;
        ConvenientBanner convenienBanner;

        public bannerViewHolder(View itemView) {
            super(itemView);
            banner_title = (TextView) itemView.findViewById(R.id.text_banner_title);
            convenienBanner = (ConvenientBanner) itemView.findViewById(R.id.convenientBanner);
        }
    }

    class videoViewHolder extends RecyclerView.ViewHolder {
        TextView video_title, video_description;
        ConvenientBanner video_convenientBanner;

        public videoViewHolder(View itemView) {
            super(itemView);
            video_title = (TextView) itemView.findViewById(R.id.text_video_title);
            video_description = (TextView) itemView.findViewById(R.id.text_video_description);
            video_convenientBanner= (ConvenientBanner) itemView.findViewById(R.id.convenientBanner);
        }
    }
}
