package com.wrg.widen.Fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.StringCallback;
import com.wrg.widen.Base.BaseFragment;
import com.wrg.widen.Content.Api;
import com.wrg.widen.Model.BanerEntity;
import com.wrg.widen.MyRecyclerview.EndlessRecyclerOnScrollListener;
import com.wrg.widen.MyRecyclerview.HeaderAndFooterRecyclerViewAdapter;
import com.wrg.widen.MyRecyclerview.RecyclerViewStateUtils;
import com.wrg.widen.MyRecyclerview.RecyclerViewUtils;
import com.wrg.widen.MyRecyclerview.SampleHeader;
import com.wrg.widen.Presenter.HomeAdapter;
import com.wrg.widen.Presenter.LoadingFooter;
import com.wrg.widen.R;
import com.wrg.widen.Util.ImagviewHodler;
import com.wrg.widen.Util.SharedUtil;

import java.util.Iterator;
import java.util.List;

import butterknife.Bind;
import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by 翁 on 2017/5/2.
 */

public class FindFragment extends BaseFragment {

    private HomeAdapter homeAdapter;

    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;

    private HeaderAndFooterRecyclerViewAdapter mHeaderAndFooterRecyclerViewAdapter;

    private ConvenientBanner convenientBanner;

    @Override
    protected int getContentId() {
        return R.layout.fragment_find;
    }


    @Override
    protected void init(View view) {
        super.init(view);
        homeAdapter = new HomeAdapter(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(homeAdapter);

        mHeaderAndFooterRecyclerViewAdapter = new HeaderAndFooterRecyclerViewAdapter(homeAdapter);
        recyclerView.setAdapter(mHeaderAndFooterRecyclerViewAdapter);
        SampleHeader sampleHeader=new SampleHeader(getContext());
        convenientBanner= (ConvenientBanner) sampleHeader.findViewById(R.id.convenientBanner);
        RecyclerViewUtils.setHeaderView(recyclerView,sampleHeader);

        recyclerView.addOnScrollListener(mOnScrollListener);

    }

    private EndlessRecyclerOnScrollListener mOnScrollListener = new EndlessRecyclerOnScrollListener() {

        @Override
        public void onLoadNextPage(View view) {
            super.onLoadNextPage(view);

            LoadingFooter.State state = RecyclerViewStateUtils.getFooterViewState(recyclerView);
            if(state == LoadingFooter.State.Loading) {
                return;
            }
            boolean slideToBottom = isSlideToBottom(recyclerView);
            if (slideToBottom==true) {
                // loading more
                RecyclerViewStateUtils.setFooterViewState(getActivity(), recyclerView, 0, LoadingFooter.State.Loading, null);
                String pageurl = SharedUtil.getString("pageurl");
                getMoreData(pageurl);

            } else {
                //the end
                RecyclerViewStateUtils.setFooterViewState(getActivity(), recyclerView, 1, LoadingFooter.State.TheEnd, null);
            }
        }
    };

    //判断Rectclerview是否到底部
    public static boolean isSlideToBottom(RecyclerView recyclerView) {
        if (recyclerView == null) return false;
        if (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset()
                >= recyclerView.computeVerticalScrollRange())
            return true;
        return false;
    }


    @Override
    protected void loadDatas() {
        super.loadDatas();
        OkGo.get(Api.BAND_URL)
                .tag(getActivity())
                .cacheKey("data")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, final Call call, Response response) {
                        BanerEntity banerEntity = new Gson().fromJson(s, BanerEntity.class);
                        String nextPageUrl = banerEntity.getNextPageUrl();
                        OkGo.get(nextPageUrl)
                                .tag(getActivity())
                                .cacheKey("list")
                                .cacheMode(CacheMode.DEFAULT)
                                .execute(new StringCallback() {
                                    @Override
                                    public void onSuccess(String s, Call call, Response response) {
                                        BanerEntity banerEntity = new Gson().fromJson(s, BanerEntity.class);
                                        homeAdapter.setDatas(banerEntity.getIssueList().get(0).getItemList());
                                        String nextPageUrl1 = banerEntity.getNextPageUrl();
                                        SharedUtil.putString("pageurl", nextPageUrl1);


                                    }
                                });


                        final List<BanerEntity.IssueListBean.ItemListBean> data = banerEntity.getIssueList().get(0).getItemList();
                        Iterator<BanerEntity.IssueListBean.ItemListBean> it = data.iterator();
                        //用迭代器删除
                        while (it.hasNext()) {
                            BanerEntity.IssueListBean.ItemListBean bean = it.next();
                            if (bean.getType().equals("banner2")) {
                                it.remove();
                            }
                        }
                        convenientBanner.setPages(new CBViewHolderCreator() {
                            @Override
                            public Object createHolder() {
                                return new ImagviewHodler();
                            }
                        }, data).
                                setPageIndicator(new int[]{R.mipmap.point_grey, R.mipmap.point_white})
                                .startTurning(3000)
                                .setPointViewVisible(true)
                                .setOnItemClickListener(new OnItemClickListener() {
                                    @Override
                                    public void onItemClick(int position) {

                                        String playUrl = data.get(position).getData().getPlayUrl();
                                        //GiraffePlayerActivity.configPlayer(getActivity()).play(playUrl);

                                    }

                                });

                    }
                });
    }


    private void getMoreData(String url) {
        OkGo.get(url)
                .tag(getActivity())
                .cacheKey("list")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        BanerEntity banerEntity = new Gson().fromJson(s, BanerEntity.class);
                        homeAdapter.addData(banerEntity.getIssueList().get(0).getItemList());
                        SharedUtil.cleanSharedPreferences(getContext());
                        String nextPageUrl2 = banerEntity.getNextPageUrl();
                        SharedUtil.putString("pageurl", nextPageUrl2);

                    }
                });

    }
}
