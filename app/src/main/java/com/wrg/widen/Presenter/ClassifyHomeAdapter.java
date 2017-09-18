package com.wrg.widen.Presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.wrg.widen.Model.CHomeEntity;
import com.wrg.widen.R;
import com.wrg.widen.Util.ChomeVideoViewHodler;
import com.wrg.widen.View.DetailActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 翁 on 2017/9/7.
 */

public class ClassifyHomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;

    private List<CHomeEntity.ItemListBeanX> datas;
    private List<String> tags = new ArrayList<>();

    private MyClassifyClistener myClassifyClistener;

    public void setMyClassifyClistener(MyClassifyClistener myClassifyClistener) {
        this.myClassifyClistener = myClassifyClistener;
    }

    public ClassifyHomeAdapter(Context context) {
        this.context = context;
        datas = new ArrayList<>();

    }

    public void setDatas(List<CHomeEntity.ItemListBeanX> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    public void addDatas(List<CHomeEntity.ItemListBeanX> datas) {
        this.datas.addAll(datas);
        this.notifyDataSetChanged();
    }

    public List<CHomeEntity.ItemListBeanX> getDatas(){
        return datas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder = null;

        switch (viewType) {
            case 1:
                View videoCollectionView = LayoutInflater.from(context).inflate(R.layout.layout_classify_home_video, parent, false);
                holder = new videoCollectionViewHolder(videoCollectionView);
                break;

            case 2:
                View textView = LayoutInflater.from(context).inflate(R.layout.layout_alike_recyclerview_text, parent, false);
                holder = new textHeaderViewHolder(textView);


                break;

            case 3:
                View viewViewHolder = LayoutInflater.from(context).inflate(R.layout.layout_classify_chome, parent, false);
                holder = new videoViewHolder(viewViewHolder);
                break;

            case 4:

                View footViewHolder = LayoutInflater.from(context).inflate(R.layout.layout_alike_recyclerview_text, parent, false);
                holder = new textFooterViewHolder(footViewHolder);

                break;

        }


        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


        if (holder instanceof videoCollectionViewHolder) {
            String title = datas.get(position).getData().getHeader().getTitle();
            final List<CHomeEntity.ItemListBeanX.DataBeanX.ItemListBean> itemList = datas.get(position).getData().getItemList();
            if (title != null) {
                ((videoCollectionViewHolder) holder).squre_title.setText(title);
                ((videoCollectionViewHolder) holder).convenientBanner.setPages(new CBViewHolderCreator() {
                    @Override
                    public Object createHolder() {
                        return new ChomeVideoViewHodler();
                    }
                }, itemList).setPageIndicator(new int[]{R.mipmap.point_grey, R.mipmap.point_black})
                        .setPointViewVisible(true).setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(int position) {
                        CHomeEntity.ItemListBeanX.DataBeanX.ItemListBean itemListBean = itemList.get(position);
                        String playUrl = itemListBean.getData().getPlayUrl();
                        String title = itemListBean.getData().getTitle();
                        String category = itemListBean.getData().getCategory();
                        String id = itemListBean.getData().getId();
                        String description = itemListBean.getData().getDescription();
                        String image = itemListBean.getData().getCover().getDetail();
                        Intent intent = new Intent(context, DetailActivity.class);
                        intent.putExtra("id", id);
                        intent.putExtra("description", description);
                        intent.putExtra("category", category);
                        intent.putExtra("url", playUrl);
                        intent.putExtra("title", title);
                        intent.putExtra("img", image);
                        context.startActivity(intent);
                    }
                });
            }


        } else if (holder instanceof textHeaderViewHolder) {
            ((textHeaderViewHolder) holder).banner_title.setText(datas.get(position).getData().getText());


        } else if (holder instanceof videoViewHolder) {
            String title = datas.get(position).getData().getTitle();
            if (title != null) {
                ((videoViewHolder) holder).textView_title.setText(title);
                ((videoViewHolder) holder).textView_category.setText(datas.get(position).getData().getCategory());
                int size = datas.get(position).getData().getTags().size();
                for (int i = 0; i < size; i++) {
                    tags.add(datas.get(position).getData().getTags().get(i).getName());
                }

                String replace = tags.toString().replace(",", "/").replace("[", "\"").replace("]", "\"");

                ((videoViewHolder) holder).textView_tag.setText(replace);
                tags.clear();

                setImg(context, datas.get(position).getData().getCover().getDetail(), ((videoViewHolder) holder).imageView_bg);
                setImg(context, datas.get(position).getData().getProvider().getIcon(), ((videoViewHolder) holder).imageView_icon);


            }


        } else if (holder instanceof textFooterViewHolder) {
            ((textFooterViewHolder) holder).banner_text.setText(datas.get(position).getData().getText());
        }
    }

    @Override
    public int getItemViewType(int position) {
        String type = datas.get(position).getType();
        switch (type) {
            case "videoCollectionOfHorizontalScrollCard":

                return 1;
            case "textHeader":

                return 2;
            case "video":

                return 3;

            case "textFooter":

                return 4;
        }

        return 0;
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


    class videoCollectionViewHolder extends RecyclerView.ViewHolder {
        TextView squre_title;
        ConvenientBanner convenientBanner;

        public videoCollectionViewHolder(View itemView) {
            super(itemView);

            squre_title = (TextView) itemView.findViewById(R.id.text_video_title);
            convenientBanner = (ConvenientBanner) itemView.findViewById(R.id.convenientBanner);
        }
    }

    class textHeaderViewHolder extends RecyclerView.ViewHolder {
        TextView banner_title;

        public textHeaderViewHolder(View itemView) {
            super(itemView);
            banner_title = (TextView) itemView.findViewById(R.id.text_text);
        }
    }

    class videoViewHolder extends RecyclerView.ViewHolder {
        TextView textView_title, textView_tag, textView_category;
        ImageView imageView_bg, imageView_icon;

        public videoViewHolder(View itemView) {
            super(itemView);
            textView_title = (TextView) itemView.findViewById(R.id.layout_text_title);
            textView_tag = (TextView) itemView.findViewById(R.id.layout_text_tags);
            textView_category = (TextView) itemView.findViewById(R.id.layout_text_category);
            imageView_bg = (ImageView) itemView.findViewById(R.id.layout_img_bg);
            imageView_icon = (ImageView) itemView.findViewById(R.id.layout_img_icon);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (myClassifyClistener!=null){
                        myClassifyClistener.doClassifySuccess(v,getPosition());
                    }
                }
            });
        }
    }

    interface MyClassifyClistener{
        void doClassifySuccess(View view,int position);

    }

    class textFooterViewHolder extends RecyclerView.ViewHolder {
        TextView banner_text;

        public textFooterViewHolder(View itemView) {
            super(itemView);
            banner_text = (TextView) itemView.findViewById(R.id.text_text);
        }
    }

    private void setImg(Context context, String url, ImageView imageView) {
        Glide.with(context.getApplicationContext()).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(imageView);
    }
}
