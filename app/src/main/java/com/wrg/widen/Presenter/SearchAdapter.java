package com.wrg.widen.Presenter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.wrg.widen.Model.SearchEntity;
import com.wrg.widen.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 翁 on 2017/9/7.
 */

public class SearchAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;

    private List<SearchEntity.ItemListBean> datas;
    private List<String> tags = new ArrayList<>();

    private MyClassifyClistener myClassifyClistener;

    public void setMyClassifyClistener(MyClassifyClistener myClassifyClistener) {
        this.myClassifyClistener = myClassifyClistener;
    }

    public SearchAdapter(Context context) {
        this.context = context;
        datas = new ArrayList<>();

    }

    public void setDatas(List<SearchEntity.ItemListBean> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    public void addDatas(List<SearchEntity.ItemListBean> datas) {
        this.datas.addAll(datas);
        this.notifyDataSetChanged();
    }

    public List<SearchEntity.ItemListBean> getDatas() {
        return datas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder = null;


        View viewViewHolder = LayoutInflater.from(context).inflate(R.layout.layout_search, parent, false);
        holder = new videoViewHolder(viewViewHolder);


        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


        if (holder instanceof videoViewHolder) {
            String title = datas.get(position).getData().getTitle();
            if (title != null) {
                ((videoViewHolder) holder).textView_title.setText(title);
                ((videoViewHolder) holder).textView_category.setText(datas.get(position).getData().getCategory());
               /* int size = datas.get(position).getData().getTags().size();
                for (int i = 0; i < size; i++) {
                    tags.add(datas.get(position).getData().getTags().get(i).getName());
                }

                String replace = tags.toString().replace(",", "/").replace("[", "\"").replace("]", "\"");

                ((videoViewHolder) holder).textView_tag.setText(replace);*/

                setImg(context.getApplicationContext(), datas.get(position).getData().getCover().getDetail(), ((videoViewHolder) holder).imageView_bg);


            }


        }
    }


    @Override
    public int getItemCount() {
        return datas.size();
    }


    class videoViewHolder extends RecyclerView.ViewHolder {
        TextView textView_title, textView_tag, textView_category;
        ImageView imageView_bg, imageView_icon;

        public videoViewHolder(View itemView) {
            super(itemView);
            textView_title = (TextView) itemView.findViewById(R.id.layout_text_title);
            textView_category = (TextView) itemView.findViewById(R.id.layout_text_category);
            imageView_bg = (ImageView) itemView.findViewById(R.id.layout_img_bg);

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
        Glide.with(context).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(imageView);
    }
}
