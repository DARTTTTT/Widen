package com.wrg.widen.Util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.wrg.widen.Model.BanerEntity;
import com.wrg.widen.R;

/**
 * Created by 翁 on 2017/5/3.
 */

public class ImagviewHodler implements Holder<BanerEntity.IssueListBean.ItemListBean> {
    private ImageView imageView;
    private TextView textView_title,textView_slogan;

    @Override
    public View createView(Context context) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_banner, null);
        imageView= (ImageView) view.findViewById(R.id.banner_img);
        textView_title= (TextView) view.findViewById(R.id.banner_title);
        textView_slogan= (TextView) view.findViewById(R.id.banner_slogan);
        //imageView = new ImageView(context);
        //imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return view;
    }

    @Override
    public void UpdateUI(Context context, int position, BanerEntity.IssueListBean.ItemListBean data) {
        String detail = data.getData().getCover().getDetail();
        Glide.with(context.getApplicationContext())
                .load(detail)
                .centerCrop()
                .into(imageView);
        new WriteTextHandler(textView_title,data.getData().getTitle()).setText();
        if (data.getData().getSlogan()==null){
            textView_slogan.setText(data.getData().getSlogan());

        }else {

            new WriteTextHandler(textView_slogan,data.getData().getSlogan()).setText();
        }

        //textView_title.setText(data.getData().getTitle());
    }
}
