package com.wrg.widen.Presenter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.wrg.widen.Model.ClassifyEntity;
import com.wrg.widen.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 翁 on 2017/9/7.
 */

public class SqureClassifyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<ClassifyEntity.ItemListBeanX.DataBeanX.ItemListBean> datas;

    private MyItemClickListener mListener;


    public void setmListener(MyItemClickListener mListener) {
        this.mListener = mListener;
    }

    public SqureClassifyAdapter(Context context) {
        this.context = context;
        datas = new ArrayList<>();
    }

    public void setDatas(List<ClassifyEntity.ItemListBeanX.DataBeanX.ItemListBean> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder = null;
        switch (viewType){
            case 1:
                View squreView= LayoutInflater.from(context).inflate(R.layout.layout_squre_adapter,parent,false);
                holder=new SqureViewHolder(squreView);
                break;
            case 2:
                View actionView=LayoutInflater.from(context).inflate(R.layout.layout_action_adapter,parent,false);
                holder=new actionViewHolder(actionView);

                break;
        }

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if (holder instanceof SqureViewHolder){
                ((SqureViewHolder) holder).text_title.setText(datas.get(position).getData().getTitle());
                Glide.with(context.getApplicationContext())
                        .load(datas.get(position).getData().getImage())
                        .centerCrop()
                        .into(((SqureViewHolder) holder).img_bg);


            }else if (holder instanceof actionViewHolder){
                ((actionViewHolder) holder).text_more.setText(datas.get(position).getData().getText());
            }
    }

    @Override
    public int getItemViewType(int position) {
        switch (datas.get(position).getType()) {
            case "squareCard":
                return 1;
            case "actionCard":
                return 2;
        }
        return 0;
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class SqureViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView img_bg;
        private TextView text_title;
        public SqureViewHolder(View itemView) {
            super(itemView);
            img_bg= (ImageView) itemView.findViewById(R.id.img_classify_bg);
            text_title= (TextView) itemView.findViewById(R.id.text_classify_name);

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


    class actionViewHolder extends RecyclerView.ViewHolder {
        TextView text_more;
        public actionViewHolder(View itemView) {
            super(itemView);
            text_more= (TextView) itemView.findViewById(R.id.text_action_name);
        }
    }
}
