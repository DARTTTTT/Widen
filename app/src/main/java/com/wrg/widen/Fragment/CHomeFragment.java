package com.wrg.widen.Fragment;

import android.view.View;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.wrg.widen.Base.BaseFragment;
import com.wrg.widen.Presenter.ClassifyHomeAdapter;
import com.wrg.widen.Presenter.MainPresenter;
import com.wrg.widen.Presenter.MainPresenterControl;
import com.wrg.widen.R;

import butterknife.Bind;

/**
 * Created by 翁 on 2017/9/8.
 */

public class CHomeFragment extends BaseFragment {
    @Bind(R.id.recyclerView)
    XRecyclerView recyclerView;
    private MainPresenter mainPresenter;

    private ClassifyHomeAdapter classifyHomeAdapter;

    @Override
    protected int getContentId() {
        return R.layout.fragment_chome;
    }

    @Override
    protected void init(View view) {
        super.init(view);

        mainPresenter=new MainPresenterControl(getContext());

        classifyHomeAdapter=new ClassifyHomeAdapter(getContext());

        mainPresenter.doGetClassifyHomeData(getContext(),recyclerView,classifyHomeAdapter,0);
    }
}
