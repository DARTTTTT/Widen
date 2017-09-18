package com.wrg.widen.Util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.wrg.widen.Model.ClassifyEntity;
import com.wrg.widen.R;

/**
 * Created by 翁 on 2017/5/3.
 */

public class BannerviewHodler implements Holder<ClassifyEntity.ItemListBeanX.DataBeanX.ItemListBean> {
    private ImageView imageView;

    @Override
    public View createView(Context context) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_banner_classify, null);
        imageView= (ImageView) view.findViewById(R.id.banner_img);
        return view;
    }

    @Override
    public void UpdateUI(Context context, int position, ClassifyEntity.ItemListBeanX.DataBeanX.ItemListBean data) {
        Glide.with(context.getApplicationContext())
                .load(data.getData().getImage())
                .centerCrop()
                .into(imageView);

    }
}
