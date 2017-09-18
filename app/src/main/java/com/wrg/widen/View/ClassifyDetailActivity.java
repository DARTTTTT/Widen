package com.wrg.widen.View;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;
import com.wrg.widen.Base.BaseActivity;
import com.wrg.widen.Content.Api;
import com.wrg.widen.Presenter.MainPresenter;
import com.wrg.widen.Presenter.MainPresenterControl;
import com.wrg.widen.Presenter.MyPagerAdapter;
import com.wrg.widen.R;

import butterknife.Bind;

/**
 * Created by 翁 on 2017/9/8.
 */

public class ClassifyDetailActivity extends BaseActivity {

    @Bind(R.id.back)
    ImageView img_back;

    @Bind(R.id.text_name)
    TextView text_name;


    @Bind(R.id.text_description)
    TextView text_description;

    @Bind(R.id.tablayout)
    TabLayout tabLayout;





    @Bind(R.id.viewpager)
    ViewPager viewpager;

    @Bind(R.id.img_bg)
    ImageView img_bg;

    /*@Bind(R.id.swipeLayout)
    SwipeRefreshLayout swipeRefreshLayout;*/


    private MainPresenter mainPresenter;



    @Override
    protected int getContentId() {
        return R.layout.activity_classifydetail;
    }

    @Override
    protected void init() {
        super.init();
        StatusBarUtil.setColor(ClassifyDetailActivity.this, Color.BLACK, 50);


        mainPresenter=new MainPresenterControl(this);

        mainPresenter.doImgClick(this,img_back);

        Intent intent=getIntent();
        String squre_id = intent.getStringExtra("squre_id");
        String url=String.format(Api.CLASSIFY_DETAIL_URL,squre_id);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());

        mainPresenter.doGetClassifyDetailData(this,tabLayout,viewpager,myPagerAdapter,url,img_bg,text_name,text_description);

    }

    @Override
    public boolean isOpenStatus() {
        return false;
    }
}
