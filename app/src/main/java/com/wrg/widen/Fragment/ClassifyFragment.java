package com.wrg.widen.Fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ImageView;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.wrg.widen.Base.BaseFragment;
import com.wrg.widen.Content.Api;
import com.wrg.widen.Presenter.ClassifyAdapter;
import com.wrg.widen.Presenter.MainPresenter;
import com.wrg.widen.Presenter.MainPresenterControl;
import com.wrg.widen.Presenter.SearchAdapter;
import com.wrg.widen.R;

import butterknife.Bind;

/**
 * Created by 翁 on 2017/5/2.
 */

public class ClassifyFragment extends BaseFragment {


    @Bind(R.id.recyclerView)
    XRecyclerView recyclerView;

    @Bind(R.id.img_search)
    ImageView img_search;

    @Bind(R.id.swipeLayout)
    SwipeRefreshLayout swipeRefreshLayout;

    private MainPresenter mainPresenter;

    private ClassifyAdapter classifyAdapter;

    private SearchAdapter searchAdapter;


   @Override
    protected int getContentId() {
        return R.layout.fragment_classify;

    }

    @Override
    protected void init(View view) {
        super.init(view);

        classifyAdapter=new ClassifyAdapter(getContext());
        searchAdapter=new SearchAdapter(getContext());


        mainPresenter=new MainPresenterControl(getContext());
        mainPresenter.doGetClassifyData(getContext(),swipeRefreshLayout,recyclerView,classifyAdapter, Api.CLASSIFY_URL);

        mainPresenter.doImgClick(getActivity(),img_search);


    }


}
