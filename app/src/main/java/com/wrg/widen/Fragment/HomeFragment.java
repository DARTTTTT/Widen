package com.wrg.widen.Fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.wrg.widen.Base.BaseFragment;
import com.wrg.widen.Content.Api;
import com.wrg.widen.Presenter.HomeAdapter;
import com.wrg.widen.Presenter.MainPresenter;
import com.wrg.widen.Presenter.MainPresenterControl;
import com.wrg.widen.R;

import butterknife.Bind;

/**
 * Created by 翁 on 2017/5/2.
 */

public class HomeFragment extends BaseFragment {


    /*@Bind(R.id.convenientBanner)
    ConvenientBanner convenientBanner;*/

    @Bind(R.id.swipeLayout)
    SwipeRefreshLayout swipeRefreshLayout;

    @Bind(R.id.recyclerView)
    XRecyclerView recyclerView;


    @Override
    protected int getContentId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void init(View view) {
        super.init(view);

        HomeAdapter homeAdapter=new HomeAdapter(getContext());


        MainPresenter mainPresenter=new MainPresenterControl(getContext());

        //获取banner的数据
        mainPresenter.doGetHomeData(getActivity(), Api.BAND_URL,swipeRefreshLayout,recyclerView,homeAdapter);
        //mainPresenter.doGetHomeListData(getActivity(),recyclerView,homeAdapter);

    }

}
