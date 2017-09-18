package com.wrg.widen.View;

import android.graphics.Color;
import android.support.annotation.IdRes;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.jaeger.library.StatusBarUtil;
import com.wrg.widen.Base.BaseActivity;
import com.wrg.widen.Fragment.ClassifyFragment;
import com.wrg.widen.Fragment.HomeFragment;
import com.wrg.widen.Presenter.MainPresenter;
import com.wrg.widen.Presenter.MainPresenterControl;
import com.wrg.widen.R;

import butterknife.Bind;

public class MainActivity extends BaseActivity implements   RadioGroup.OnCheckedChangeListener
{

    @Bind(R.id.main_rg)
    RadioGroup radioGroup;

    @Bind(R.id.rg_btn1)
    RadioButton radioButton1;



    @Override
    protected int getContentId() {
        return R.layout.activity_main;

    }


    @Override
    protected void init() {
        super.init();
        StatusBarUtil.setColor(MainActivity.this, Color.BLACK, 50);

        MainPresenter mainPresenter=new MainPresenterControl(this);
        //页面切换
       // mainPresenter.doAddFragment(this,radioGroup,toolbarTitle);

        radioGroup.setOnCheckedChangeListener(this);
        radioGroup.getChildAt(0).performClick();
    }

    @Override
    public boolean isOpenStatus() {
        return  false;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId) {
            case R.id.rg_btn1:
                showFragment(R.id.zbj, new HomeFragment());
                break;
            case R.id.rg_btn2:
                showFragment(R.id.zbj, new ClassifyFragment());
                break;
           /* case R.id.rg_btn3:
                showFragment(R.id.zbj, new ClassifyFragment());
                break;*/
        }
    }

}
