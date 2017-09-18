package com.wrg.widen.Fragment;

import android.view.View;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.wrg.widen.Base.BaseFragment;
import com.wrg.widen.Presenter.ClassifyAllAdapter;
import com.wrg.widen.Presenter.MainPresenter;
import com.wrg.widen.Presenter.MainPresenterControl;
import com.wrg.widen.R;

import butterknife.Bind;

/**
 * Created by 翁 on 2017/9/8.
 */

public class CAllFragment extends BaseFragment {
    @Bind(R.id.recyclerView)
    XRecyclerView recyclerView;
    private MainPresenter mainPresenter;

    private ClassifyAllAdapter classifyAllAdapter;

    @Override
    protected int getContentId() {
        return R.layout.fragment_chome;
    }

    @Override
    protected void init(View view) {
        super.init(view);

        mainPresenter=new MainPresenterControl(getContext());

        classifyAllAdapter=new ClassifyAllAdapter(getContext());

        mainPresenter.doGetClassifyAllData(getContext(),recyclerView,classifyAllAdapter,1);
    }
}
