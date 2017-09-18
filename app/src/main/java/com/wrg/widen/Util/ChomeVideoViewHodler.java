package com.wrg.widen.Util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.wrg.widen.Model.CHomeEntity;
import com.wrg.widen.R;

/**
 * Created by 翁 on 2017/5/3.
 */

public class ChomeVideoViewHodler implements Holder<CHomeEntity.ItemListBeanX.DataBeanX.ItemListBean> {
    private ImageView imageView;
    private TextView textView_title, textView_slogan;

    @Override
    public View createView(Context context) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_banner_video, null);
        imageView = (ImageView) view.findViewById(R.id.banner_img);
        textView_title = (TextView) view.findViewById(R.id.banner_title);
        textView_slogan = (TextView) view.findViewById(R.id.banner_slogan);
        return view;
    }

    @Override
    public void UpdateUI(Context context, int position, CHomeEntity.ItemListBeanX.DataBeanX.ItemListBean data) {
        String detail = data.getData().getTitle();
        textView_title.setText(detail);
        textView_slogan.setText(data.getData().getCategory());
        String image = data.getData().getCover().getDetail();
        Glide.with(context.getApplicationContext())
                .load(image)
                .centerCrop()
                .into(imageView);

    }
}
