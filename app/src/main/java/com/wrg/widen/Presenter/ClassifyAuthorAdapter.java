package com.wrg.widen.Presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.wrg.widen.Model.CAuthorEntity;
import com.wrg.widen.R;
import com.wrg.widen.View.DetailActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 翁 on 2017/9/7.
 */

public class ClassifyAuthorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;

    private List<CAuthorEntity.ItemListBeanX> datas;

    private SqureAuthorAdapter squreAuthorAdapter;
    private List<String> tags = new ArrayList<>();

    private MyClassifyClistener myClassifyClistener;

    public void setMyClassifyClistener(MyClassifyClistener myClassifyClistener) {
        this.myClassifyClistener = myClassifyClistener;
    }

    public ClassifyAuthorAdapter(Context context) {
        this.context = context;
        datas = new ArrayList<>();

    }

    public void setDatas(List<CAuthorEntity.ItemListBeanX> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    public void addDatas(List<CAuthorEntity.ItemListBeanX> datas) {
        this.datas.addAll(datas);
        this.notifyDataSetChanged();
    }

    public List<CAuthorEntity.ItemListBeanX> getDatas() {
        return datas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder ;


        View viewViewHolder = LayoutInflater.from(context).inflate(R.layout.layout_classify_author, parent, false);
        holder = new videoViewHolder(viewViewHolder);


        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        squreAuthorAdapter=new SqureAuthorAdapter(context);

            if (holder instanceof videoViewHolder){
                final CAuthorEntity.ItemListBeanX.DataBeanX data = datas.get(position).getData();
                ((videoViewHolder) holder).textView_title.setText(data.getHeader().getTitle());
                String description = data.getHeader().getDescription();
                if (description!=null){
                    ((videoViewHolder) holder).textView_tag.setText(description);

                }
                setImg(context, data.getHeader().getIcon(),((videoViewHolder) holder).imageView_icon);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
                linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                ((videoViewHolder) holder).recyclerView.setLayoutManager(linearLayoutManager);
                squreAuthorAdapter.setDatas(data.getItemList());
                ((videoViewHolder) holder).recyclerView.setAdapter(squreAuthorAdapter);

                squreAuthorAdapter.setmListener(new SqureAuthorAdapter.MyItemClickListener() {
                    @Override
                    public void doOnSuccessClick(View view, int position) {
                        CAuthorEntity.ItemListBeanX.DataBeanX.ItemListBean.DataBean data1 = data.getItemList().get(position).getData();
                        String playUrl = data1.getPlayUrl();
                        String title = data1.getTitle();
                        Intent intent = new Intent(context, DetailActivity.class);

                        String category = data1.getCategory();
                        String description = data1.getDescription();
                        String id = data1.getId();
                        intent.putExtra("url", playUrl);
                        intent.putExtra("title", title);
                        intent.putExtra("img", data1.getCover().getDetail());
                        intent.putExtra("id", id);
                        intent.putExtra("description", description);
                        intent.putExtra("category", category);

                        context.startActivity(intent);

                    }
                });

            }


    }


    @Override
    public int getItemCount() {
        return datas.size();
    }


    class videoViewHolder extends RecyclerView.ViewHolder {
        TextView textView_title, textView_tag, textView_category;
        ImageView imageView_bg, imageView_icon;
        RecyclerView recyclerView;

        public videoViewHolder(View itemView) {
            super(itemView);
            textView_title = (TextView) itemView.findViewById(R.id.layout_text_title);
            textView_tag = (TextView) itemView.findViewById(R.id.layout_text_tags);
            imageView_icon = (ImageView) itemView.findViewById(R.id.layout_img_icon);
            recyclerView= (RecyclerView) itemView.findViewById(R.id.recyclerView_squre);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (myClassifyClistener != null) {
                        myClassifyClistener.doClassifySuccess(v, getPosition());
                    }
                }
            });
        }
    }

    interface MyClassifyClistener {
        void doClassifySuccess(View view, int position);

    }


    private void setImg(Context context, String url, ImageView imageView) {
        Glide.with(context.getApplicationContext()).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(imageView);
    }
}
