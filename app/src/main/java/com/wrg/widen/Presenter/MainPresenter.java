package com.wrg.widen.Presenter;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcodecraeer.xrecyclerview.XRecyclerView;

import tcking.github.com.giraffeplayer.GiraffePlayer;

/**
 * Created by 翁 on 2017/8/28.
 */

public interface MainPresenter {


    void doGetHomeData(Context context, String url, SwipeRefreshLayout swipeRefreshLayout, XRecyclerView recyclerView, HomeAdapter homeAdapter);

   // void doGetHomeListData(Context context, RecyclerView recyclerView,HomeAdapter homeAdapter);

    void doPlayVideo(Activity context, GiraffePlayer giraffePlayer, String url, String title);

    void doGetAlikeData(Context context, String id, AlikeAdapter alikeAdapter, XRecyclerView recyclerView, String title, String tag, String content, ImageView imageView);


    void doGetClassifyData(Context context,SwipeRefreshLayout swipeRefreshLayout, XRecyclerView recyclerView,ClassifyAdapter classifyAdapter, String url);

    void doImgClick(Activity context,ImageView imageView);

    void doGetClassifyDetailData(Context context, TabLayout tabLayout, ViewPager viewPager,MyPagerAdapter myPagerAdapter,String url, ImageView imageView, TextView name, TextView des);


    void doGetClassifyHomeData(Context context, XRecyclerView xRecyclerView, ClassifyHomeAdapter classifyHomeAdapter, int position);

    void doGetClassifyAllData(Context context, XRecyclerView xRecyclerView, ClassifyAllAdapter classifyHomeAdapter, int position);


    void doGetClassifyAuthorData(Context context, XRecyclerView xRecyclerView, ClassifyAuthorAdapter classifyAuthorAdapter, int position);
}
