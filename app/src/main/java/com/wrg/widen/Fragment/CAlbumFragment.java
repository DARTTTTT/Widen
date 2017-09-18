package com.wrg.widen.Fragment;

import android.view.View;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.wrg.widen.Base.BaseFragment;
import com.wrg.widen.Presenter.ClassifyAuthorAdapter;
import com.wrg.widen.Presenter.MainPresenter;
import com.wrg.widen.Presenter.MainPresenterControl;
import com.wrg.widen.R;

import butterknife.Bind;

/**
 * Created by 翁 on 2017/9/8.
 */

public class CAlbumFragment extends BaseFragment {
    @Bind(R.id.recyclerView)
    XRecyclerView recyclerView;
    private MainPresenter mainPresenter;

    private ClassifyAuthorAdapter classifyAuthorAdapter;

    @Override
    protected int getContentId() {
        return R.layout.fragment_chome;
    }

    @Override
    protected void init(View view) {
        super.init(view);

        mainPresenter=new MainPresenterControl(getContext());

        classifyAuthorAdapter=new ClassifyAuthorAdapter(getContext());

        mainPresenter.doGetClassifyAuthorData(getContext(),recyclerView,classifyAuthorAdapter,3);
    }
}
