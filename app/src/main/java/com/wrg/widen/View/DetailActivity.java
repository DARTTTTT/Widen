package com.wrg.widen.View;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.wrg.widen.Base.BaseActivity;
import com.wrg.widen.Presenter.AlikeAdapter;
import com.wrg.widen.Presenter.MainPresenter;
import com.wrg.widen.Presenter.MainPresenterControl;
import com.wrg.widen.R;

import butterknife.Bind;
import jp.wasabeef.glide.transformations.BlurTransformation;
import tcking.github.com.giraffeplayer.GiraffePlayer;

/**
 * Created by 翁 on 2017/9/4.
 */

public class DetailActivity extends BaseActivity {
    @Bind(R.id.detail_img_bg)
    ImageView imageView_bg;


    private GiraffePlayer giraffePlayer;


    @Bind(R.id.recyclerView)
    XRecyclerView recyclerView;

    private MainPresenter mainPresenter;

    private AlikeAdapter alikeAdapter;

    @Override
    protected int getContentId() {
        return R.layout.activity_detail;
    }

    @Override
    protected void init() {
        super.init();
        //StatusBarUtil.setColorForSwipeBack(DetailActivity.this, Color.BLACK, 50);

        mainPresenter = new MainPresenterControl(this);
        alikeAdapter = new AlikeAdapter(this);


        giraffePlayer = new GiraffePlayer(this);

        View view = LayoutInflater.from(this).inflate(R.layout.layout_head_alike, null);
        TextView textView_title = (TextView) view.findViewById(R.id.detail_text_title);

        Intent intent = getIntent();
        //Bundle bundle = intent.getBundleExtra("bundle");
        //BanerEntity.IssueListBean.ItemListBean.DataBean data = (BanerEntity.IssueListBean.ItemListBean.DataBean) bundle.getSerializable("data");

        String img = intent.getStringExtra("img");


        //播放地址
        String url = intent.getStringExtra("url");
        String title = intent.getStringExtra("title");
        String category = intent.getStringExtra("category");
        String description = intent.getStringExtra("description");
        String id = intent.getStringExtra("id");
        //播放类似的视频数据
        mainPresenter.doGetAlikeData(this, id, alikeAdapter, recyclerView, title, category, description, imageView_bg);


        Glide.with(getApplicationContext()).load(img)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .bitmapTransform(new BlurTransformation(DetailActivity.this, 99))
                .into(imageView_bg);

        //播放视频
        mainPresenter.doPlayVideo(this, giraffePlayer, url, title);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (giraffePlayer != null) {

            giraffePlayer.onDestroy();
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (giraffePlayer != null) {

            giraffePlayer.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (giraffePlayer != null) {

            giraffePlayer.onPause();
        }
    }

    @Override
    public void onBackPressed() {
        if (giraffePlayer != null && giraffePlayer.onBackPressed()) {
            return;
        }
        super.onBackPressed();

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (giraffePlayer != null) {
            giraffePlayer.onConfigurationChanged(newConfig);

        }
        //如果旋转了就全屏
       /* if (orientationUtils.getScreenType() == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){
            giraffePlayer.onConfigurationChanged(this, newConfig, orientationUtils);

        }*/
    }

    @Override
    public boolean isOpenStatus() {
        return true;
    }
}
