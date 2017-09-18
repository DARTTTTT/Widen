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
import com.wrg.widen.Model.CAuthorEntity;
import com.wrg.widen.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 翁 on 2017/9/7.
 */

public class SqureAuthorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<CAuthorEntity.ItemListBeanX.DataBeanX.ItemListBean> datas;

    private MyItemClickListener mListener;


    public void setmListener(MyItemClickListener mListener) {
        this.mListener = mListener;
    }

    public SqureAuthorAdapter(Context context) {
        this.context = context;
        datas = new ArrayList<>();
    }

    public void setDatas(List<CAuthorEntity.ItemListBeanX.DataBeanX.ItemListBean> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder = null;

        View squreView= LayoutInflater.from(context).inflate(R.layout.layout_author_adapter,parent,false);
        holder=new SqureViewHolder(squreView);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if (holder instanceof SqureViewHolder){
                ((SqureViewHolder) holder).layout_text_title.setText(datas.get(position).getData().getTitle());

                setImg(context,datas.get(position).getData().getCover().getDetail(),((SqureViewHolder) holder).img_bg);

            }
    }



    @Override
    public int getItemCount() {
        return datas.size();
    }

    class SqureViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView img_bg;
        private TextView layout_text_title;
        public SqureViewHolder(View itemView) {
            super(itemView);
            img_bg= (ImageView) itemView.findViewById(R.id.layout_img_bg);
            layout_text_title= (TextView) itemView.findViewById(R.id.layout_text_title);

            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            if (mListener != null) {
                mListener.doOnSuccessClick(v, getPosition());
            }
        }
    }

    interface MyItemClickListener{
        void doOnSuccessClick(View view, int position);

    }

    private void setImg(Context context, String url, ImageView imageView) {
        Glide.with(context).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(imageView);
    }

}
