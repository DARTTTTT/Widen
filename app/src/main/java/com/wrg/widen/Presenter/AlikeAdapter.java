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
import com.wrg.widen.Model.AlikeEntity;
import com.wrg.widen.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 翁 on 2017/8/29.
 */

public class AlikeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<AlikeEntity.ItemListBean> datas;
    private Context context;
    private List<String> tags = new ArrayList<>();


    private MyItemClickListener mListener;


    public void setmListener(MyItemClickListener mListener) {
        this.mListener = mListener;
    }


    public void addData(List<AlikeEntity.ItemListBean> datas) {
        this.datas.addAll(datas);
        this.notifyDataSetChanged();

    }

    public AlikeAdapter(Context context) {
        this.context = context;
        datas = new ArrayList<>();
    }

    public void setDatas(List<AlikeEntity.ItemListBean> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder holder = null;
        switch (viewType) {
            case 1:
                View inflate = LayoutInflater.from(context).inflate(R.layout.layout_alike_recyclerview_headtext, parent, false);
                holder = new dateViewHolder(inflate);


                break;
            case 2:
                View inflate1 = LayoutInflater.from(context).inflate(R.layout.layout_alike_recyclerview, parent, false);
                holder = new ListViewHolder(inflate1);
                break;

        }

        return holder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof dateViewHolder) {
            ((dateViewHolder) holder).textView_date.setText(datas.get(position).getData().getText());
        } else if (holder instanceof ListViewHolder) {
            //new WriteTextHandler(((ListViewHolder) holder).textView_title,datas.get(position).getData().getTitle()).setText();
            //new WriteTextHandler(((ListViewHolder) holder).textView_category,datas.get(position).getData().getCategory()).setText();
            int size = datas.get(position).getData().getTags().size();
            for (int i = 0; i < size; i++) {
                tags.add(datas.get(position).getData().getTags().get(i).getName());
            }


            String replace = tags.toString().replace(",", "/").replace("[", "").replace("]", "");

            ((ListViewHolder) holder).textView_tag.setText(replace);
            tags.clear();
            ((ListViewHolder) holder).textView_title.setText(datas.get(position).getData().getTitle());
            //((ListViewHolder) holder).textView_category.setText(datas.get(position).getData().getCategory());
            setImg(context.getApplicationContext(), datas.get(position).getData().getCover().getDetail(), ((ListViewHolder) holder).imageView_bg);
            // setImg(context.getApplicationContext(), datas.get(position).getData().getProvider().getIcon(), ((ListViewHolder) holder).imageView_icon);


        }


    }

    @Override
    public int getItemViewType(int position) {
        switch (datas.get(position).getType()) {

            case "textCard":
                return 1;
            case "videoSmallCard":
                return 2;
        }


        return 0;

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView textView_title, textView_tag, textView_category;
        ImageView imageView_bg, imageView_icon;

        public ListViewHolder(View itemView) {
            super(itemView);
            textView_title = (TextView) itemView.findViewById(R.id.layout_text_title);
            textView_tag = (TextView) itemView.findViewById(R.id.layout_text_tags);
            textView_category = (TextView) itemView.findViewById(R.id.layout_text_category);
            imageView_bg = (ImageView) itemView.findViewById(R.id.layout_img_bg);
            //imageView_icon = (ImageView) itemView.findViewById(R.id.layout_img_icon);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mListener != null) {
                mListener.doOnSuccessClick(v, getPosition());
            }
        }
    }

    interface MyItemClickListener {
        void doOnSuccessClick(View view, int position);

    }

    class dateViewHolder extends RecyclerView.ViewHolder {
        TextView textView_date;

        public dateViewHolder(View itemView) {
            super(itemView);
            textView_date = (TextView) itemView.findViewById(R.id.text_text);

        }
    }

    private void setImg(Context context, String url, ImageView imageView) {
        Glide.with(context.getApplicationContext()).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(imageView);
    }
}
