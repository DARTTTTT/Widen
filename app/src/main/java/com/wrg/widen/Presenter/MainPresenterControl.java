package com.wrg.widen.Presenter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ToxicBakery.viewpager.transforms.ABaseTransformer;
import com.ToxicBakery.viewpager.transforms.DepthPageTransformer;
import com.ToxicBakery.viewpager.transforms.StackTransformer;
import com.ToxicBakery.viewpager.transforms.ZoomInTransformer;
import com.ToxicBakery.viewpager.transforms.ZoomOutTranformer;
import com.alibaba.fastjson.JSON;
import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.StringCallback;
import com.wrg.widen.Content.Api;
import com.wrg.widen.Fragment.CAlbumFragment;
import com.wrg.widen.Fragment.CAllFragment;
import com.wrg.widen.Fragment.CAuthorFragment;
import com.wrg.widen.Fragment.CHomeFragment;
import com.wrg.widen.Model.AlikeEntity;
import com.wrg.widen.Model.BanerEntity;
import com.wrg.widen.Model.CAuthorEntity;
import com.wrg.widen.Model.CHomeEntity;
import com.wrg.widen.Model.ClassifyDetailEntity;
import com.wrg.widen.Model.ClassifyEntity;
import com.wrg.widen.Model.SearchEntity;
import com.wrg.widen.R;
import com.wrg.widen.Util.FastWriteTextHandler;
import com.wrg.widen.Util.ImagviewHodler;
import com.wrg.widen.Util.Network;
import com.wrg.widen.Util.SharedUtil;
import com.wrg.widen.View.DetailActivity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jp.wasabeef.glide.transformations.BlurTransformation;
import okhttp3.Call;
import okhttp3.Response;
import tcking.github.com.giraffeplayer.GiraffePlayer;

/**
 * Created by 翁 on 2017/8/28.
 */

public class MainPresenterControl implements MainPresenter, HomeAdapter.MyItemClickListener {

    private static Context context;
    private static final int REFRESH_COMPLETE = 0X110;
    private static final int REFRESH_COMPLETE2 = 0X111;

    private static SwipeRefreshLayout swipeRefreshLayout, swipeRefreshLayout2, swipeRefreshLayout3;


    private static String requestUrl, classifyUrl;
    private static XRecyclerView mRecyclerView, cRecyclerView, cARecyclerView, cBRecyclerView, cAllRecyclerView;
    private static HomeAdapter homeAdapter;


    private static ClassifyAdapter classifyAdapter;


    private final ArrayList<String> transformerList = new ArrayList<String>();
    private static ConvenientBanner convenientBanner1;


    private List<AlikeEntity.ItemListBean> itemList1;

    private ClassifyAllAdapter classifyAllAdapter;

    private ClassifyAuthorAdapter classifyAuthorAdapter;

    private String viewpager_url;


    public MainPresenterControl(Context context) {
        this.context = context;
    }


    private static String firstUrl, classifyFirstUrl;


    @Override
    public void doGetHomeData(final Context context, final String url, final SwipeRefreshLayout swipeRefreshLayout, final XRecyclerView recyclerView, final HomeAdapter homeAdapter) {
        this.swipeRefreshLayout = swipeRefreshLayout;
        this.mRecyclerView = recyclerView;
        this.context = context;
        this.requestUrl = url;
        firstUrl = url;
        this.homeAdapter = homeAdapter;
        View view = LayoutInflater.from(context).inflate(R.layout.layout_head_banner, null);
        convenientBanner1 = (ConvenientBanner) view.findViewById(R.id.convenientBanner);
        //设置bannner的跳转效果
        swipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(true);
                boolean networkAvailable = Network.isNetworkAvailable(context.getApplicationContext());

                if (networkAvailable == false) {
                    Toast.makeText(context.getApplicationContext(), "当前没有网络，请连接网络。", Toast.LENGTH_LONG).show();
                    swipeRefreshLayout.setRefreshing(false);

                }
                getData(context);
            }
        });


        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addHeaderView(view);
        recyclerView.setPullRefreshEnabled(false);//不设置刷新，默认是打开的
        //getData(context);


        recyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                // mRecyclerView.refreshComplete();
            }

            @Override
            public void onLoadMore() {
                String pageurl = SharedUtil.getString("pageurl");
                getMoreData(pageurl);
                //mRecyclerView.loadMoreComplete();
            }


        });

        homeAdapter.setmListener(this);


        recyclerView.setAdapter(homeAdapter);
        //获得banner的数据和列表的数据

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mHandler.sendEmptyMessageDelayed(REFRESH_COMPLETE, 1000);


            }
        });
        getTran(convenientBanner1, 1);


    }

    /**
     * 更多内容
     *
     * @param url
     * @return
     */
    private void getMoreData(String url) {
        OkGo.get(url)
                .tag(context)
                .cacheKey("list")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        BanerEntity banerEntity = new Gson().fromJson(s, BanerEntity.class);
                        List<BanerEntity.IssueListBean.ItemListBean> itemList = banerEntity.getIssueList().get(0).getItemList();
                        homeAdapter.addData(itemList);
                        String nextPageUrl2 = banerEntity.getNextPageUrl();
                        SharedUtil.putString("pageurl", nextPageUrl2);
                    }

                    @Override
                    public void onAfter(String s, Exception e) {
                        super.onAfter(s, e);
                        mRecyclerView.loadMoreComplete();
                        mRecyclerView.refreshComplete();
                    }

                });


    }


    private GiraffePlayer giraffePlayer;

    @Override
    public void doPlayVideo(final Activity context, final GiraffePlayer giraffePlayer, String url, String title) {
        this.giraffePlayer = giraffePlayer;
        giraffePlayer.play(url);

        giraffePlayer.setTitle(title);

        giraffePlayer.setScaleType(GiraffePlayer.SCALETYPE_FITXY);


    }


    @Override
    public void doGetAlikeData(final Context context, String id, final AlikeAdapter alikeAdapter, XRecyclerView recyclerView, String title, final String tag, final String content, final ImageView imageView) {
        recyclerView.setAdapter(alikeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setPullRefreshEnabled(false);//不设置刷新，默认是打开的
        View view = LayoutInflater.from(context).inflate(R.layout.layout_head_alike, null);
        final TextView textView_title = (TextView) view.findViewById(R.id.detail_text_title);
        final TextView textView_tag = (TextView) view.findViewById(R.id.detail_text_tag);
        final TextView textView_content = (TextView) view.findViewById(R.id.detail_text_content);
        new FastWriteTextHandler(textView_title, title).setText();
        new FastWriteTextHandler(textView_tag, "#" + tag).setText();
        new FastWriteTextHandler(textView_content, content).setText();
        recyclerView.addHeaderView(view);


        String alike_url = String.format(Api.ALIKE_URL, id);

        OkGo.get(alike_url)
                .tag(this)
                .cacheKey("alike")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        AlikeEntity alikeEntity = new Gson().fromJson(s, AlikeEntity.class);
                        itemList1 = alikeEntity.getItemList();
                        alikeAdapter.setDatas(itemList1);
                    }
                });
        //播放的底部的监听
        alikeAdapter.setmListener(new AlikeAdapter.MyItemClickListener() {
            @Override
            public void doOnSuccessClick(View view, int position) {
                AlikeEntity.ItemListBean.DataBean data = itemList1.get(position - 2).getData();
                String playUrl = data.getPlayUrl();
                String title = data.getTitle();
                String category = data.getCategory();
                String description = data.getDescription();
                //Toast.makeText(context, title, Toast.LENGTH_SHORT).show();
                // TODO: 2017/9/12
                giraffePlayer.play(playUrl);
                giraffePlayer.setTitle(title);
                new FastWriteTextHandler(textView_title, title).setText();
                new FastWriteTextHandler(textView_tag, "#" + category).setText();
                new FastWriteTextHandler(textView_content, description).setText();
                Glide.with(context).load(data.getCover().getDetail())
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .bitmapTransform(new BlurTransformation(context, 50))
                        .into(imageView);


            }
        });
    }

    /**
     * 分类的数据
     *
     * @param context
     * @param url
     */
    @Override
    public void doGetClassifyData(final Context context, final SwipeRefreshLayout swipeRefreshLayout, final XRecyclerView recyclerView, final ClassifyAdapter classifyAdapter, String url) {
        this.cRecyclerView = recyclerView;
        this.classifyAdapter = classifyAdapter;
        this.swipeRefreshLayout2 = swipeRefreshLayout;
        this.classifyUrl = url;
        classifyFirstUrl = url;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(classifyAdapter);
        recyclerView.setPullRefreshEnabled(false);
        swipeRefreshLayout2.setEnabled(false);
        swipeRefreshLayout2.post(

                new Runnable() {
                    @Override
                    public void run() {

                        swipeRefreshLayout2.setRefreshing(true);
                        boolean networkAvailable = Network.isNetworkAvailable(context.getApplicationContext());

                        if (networkAvailable == false) {
                            Toast.makeText(context.getApplicationContext(), "当前没有网络，请连接网络。", Toast.LENGTH_LONG).show();
                            swipeRefreshLayout2.setRefreshing(false);

                        }
                        getRefrshClassify(context);
                    }
                });

        recyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {

            }

            @Override
            public void onLoadMore() {
                String classifyurl = SharedUtil.getString("classifyurl");
                if (""!=classifyurl) {

                    getMoreClassifyData(classifyurl);
                } else {
                    cRecyclerView.refreshComplete();

                }

            }
        });
        /*swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mHandler.sendEmptyMessageDelayed(REFRESH_COMPLETE2, 1000);


            }
        });*/

    }

    private Dialog dialog;
    private TextView text_cancle, text_result, text_tips;
    private ImageView img_clear;

    private EditText edit_search;

    private SearchAdapter searchAdapter;

    private XRecyclerView searchRecyclerView;
    private List<SearchEntity.ItemListBean> itemList;


    @Override
    public void doImgClick(final Activity context, ImageView imageView) {

        searchAdapter = new SearchAdapter(context);
        //itemList=new ArrayList<>();

        searchAdapter.setMyClassifyClistener(new SearchAdapter.MyClassifyClistener() {
            @Override
            public void doClassifySuccess(View view, int position) {
                List<SearchEntity.ItemListBean> listBeen = searchAdapter.getDatas();
                SearchEntity.ItemListBean.DataBean data = listBeen.get(position-1).getData();
                String playUrl = data.getPlayUrl();
                String title = data.getTitle();
                Intent intent = new Intent(context, DetailActivity.class);

                String category = data.getCategory();
                String description = data.getDescription();
                String id = data.getId();
                intent.putExtra("url", playUrl);
                intent.putExtra("title", title);
                intent.putExtra("img", data.getCover().getDetail());
                intent.putExtra("id", id);
                intent.putExtra("description", description);
                intent.putExtra("category", category);

                context.startActivity(intent);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.img_search:
                        dialog = new Dialog(context, R.style.MyAlertDialogStyle);
                        final View dialog_view = LayoutInflater.from(context).inflate(R.layout.layout_dialog_search, null);
                        text_cancle = (TextView) dialog_view.findViewById(R.id.text_cancle);
                        img_clear = (ImageView) dialog_view.findViewById(R.id.img_clear);
                        edit_search = (EditText) dialog_view.findViewById(R.id.edit_search);
                        text_result = (TextView) dialog_view.findViewById(R.id.text_result);
                        text_tips = (TextView) dialog_view.findViewById(R.id.text_tips);
                        searchRecyclerView = (XRecyclerView) dialog_view.findViewById(R.id.recyclerView);
                        text_cancle.setOnClickListener(this);
                        img_clear.setOnClickListener(this);


                        searchRecyclerView.setPullRefreshEnabled(false);
                        searchRecyclerView.setLayoutManager(new LinearLayoutManager(context));
                        searchRecyclerView.setAdapter(searchAdapter);
                        //这里是为了重新打开搜索情况之前的数据
                        itemList = new ArrayList<>();
                        searchAdapter.setDatas(itemList);

                        searchRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
                            @Override
                            public void onRefresh() {

                            }

                            @Override
                            public void onLoadMore() {
                                String searchurl = SharedUtil.getString("searchurl");
                                if (""!=searchurl) {
                                    getSearchMoreData(searchurl);

                                } else {
                                    searchRecyclerView.refreshComplete();
                                }
                            }
                        });

                        //输入框的输入监听
                        edit_search.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                            }

                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                                if (s.length() == 0) {
                                    img_clear.setVisibility(View.GONE);
                                    text_cancle.setText("取消");
                                    text_cancle.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            dialog.dismiss();
                                        }
                                    });
                                } else {
                                    img_clear.setVisibility(View.VISIBLE);
                                    text_cancle.setText("搜索");
                                    text_cancle.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            String edit_str = edit_search.getText().toString();
                                            String search_url = String.format(Api.SEARCH_URL, edit_str);
                                            text_result.setVisibility(View.VISIBLE);
                                            text_tips.setVisibility(View.GONE);
                                            //搜索的时候隐藏键盘
                                            InputMethodManager imm = (InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE);
                                            imm.hideSoftInputFromWindow(v.getWindowToken(),0);
                                            getSearchData(search_url);
                                        }
                                    });

                                }
                            }

                            @Override
                            public void afterTextChanged(Editable s) {

                            }
                        });
                        dialog.setContentView(dialog_view);
                        dialog.show();
                        break;

                    case R.id.back:
                        context.finish();
                        break;

                    case R.id.text_cancle:
                        dialog.dismiss();

                        break;

                    case R.id.img_clear:
                        edit_search.setText("");

                        break;


                }
            }
        });
    }


    private void getSearchData(String url) {
        OkGo.get(url)
                .tag(context)
                .cacheKey("searchlist")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        SearchEntity searchEntity = JSON.parseObject(s, SearchEntity.class);
                        itemList = searchEntity.getItemList();
                        searchAdapter.setDatas(itemList);

                        String nextPageUrl = searchEntity.getNextPageUrl();
                        if (nextPageUrl==null){
                            text_result.setText("- " + "[ " + edit_search.getText().toString() + " ] " + "搜索结果共" + searchEntity.getCount() + "个 -");

                        }else {

                            text_result.setText("- " + "[ " + edit_search.getText().toString() + " ] " + "搜索结果共" + searchEntity.getTotal() + "个 -");
                        }

                        SharedUtil.putString("searchurl", nextPageUrl);


                    }
                });

    }

    private int count=1;
    private void getSearchMoreData(String url) {
        OkGo.get(url)
                .tag(context)
                .cacheKey("searchlist")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        SearchEntity searchEntity = JSON.parseObject(s, SearchEntity.class);
                        List<SearchEntity.ItemListBean> itemList = searchEntity.getItemList();
                        searchAdapter.addDatas(itemList);
                        String nextPageUrl = searchEntity.getNextPageUrl();
                        count++;
                        Log.d("print", "onSuccess: 第"+count+"次获得"+nextPageUrl);
                        SharedUtil.putString("searchurl", nextPageUrl);



                    }

                    @Override
                    public void onAfter(String s, Exception e) {
                        super.onAfter(s, e);
                        searchRecyclerView.refreshComplete();
                        searchRecyclerView.loadMoreComplete();
                    }
                });
    }


    private static String classifDetailyUrl;
    private static ImageView imageView;
    private static TextView textView_name;
    private static TextView textView_des;
    private static ViewPager mViewPager;
    private static TabLayout tabLayout;
    private static MyPagerAdapter myPagerAdapter;

    private static List<String> urlList = new ArrayList<>();

    @Override
    public void doGetClassifyDetailData(final Context context, TabLayout tabLayout, ViewPager viewPager, MyPagerAdapter myPagerAdapter, String url, final ImageView imageView, final TextView textName, final TextView textDes) {
        this.swipeRefreshLayout3 = swipeRefreshLayout;
        this.classifDetailyUrl = url;
        this.imageView = imageView;
        this.textView_des = textDes;
        this.textView_name = textName;
        this.mViewPager = viewPager;
        this.tabLayout = tabLayout;
        this.myPagerAdapter = myPagerAdapter;

        viewPager.setOffscreenPageLimit(4);
        getClassifyDetail(context);


    }

    /**
     * 分类首页的数据
     *
     * @param context
     * @param position
     */
    @Override
    public void doGetClassifyHomeData(final Context context, XRecyclerView recyclerView, final ClassifyHomeAdapter classifyHomeAdapter, final int position) {
        //this.classifyHomeAdapter = classifyHomeAdapter;
        this.cARecyclerView = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(classifyHomeAdapter);
        viewpager_url = urlList.get(position);
        recyclerView.setPullRefreshEnabled(false);


        classifyHomeAdapter.setMyClassifyClistener(new ClassifyHomeAdapter.MyClassifyClistener() {
            @Override
            public void doClassifySuccess(View view, int position) {
                List<CHomeEntity.ItemListBeanX> datas = classifyHomeAdapter.getDatas();
                CHomeEntity.ItemListBeanX.DataBeanX data = datas.get(position - 1).getData();
                String playUrl = data.getPlayUrl();
                String title = data.getTitle();
                String category = data.getCategory();
                String id = data.getId();
                String description = data.getDescription();
                String image = data.getCover().getDetail();
                Toast.makeText(context, title, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("id", id);
                intent.putExtra("description", description);
                intent.putExtra("category", category);
                intent.putExtra("url", playUrl);
                intent.putExtra("title", title);
                intent.putExtra("img", image);
                context.startActivity(intent);
            }
        });

        OkGo.get(viewpager_url)
                .tag(context)
                .cacheKey("viewlist")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        CHomeEntity cHomeEntity = JSON.parseObject(s, CHomeEntity.class);
                        List<CHomeEntity.ItemListBeanX> itemList = cHomeEntity.getItemList();
                        classifyHomeAdapter.setDatas(itemList);
                        String nextPageUrl = cHomeEntity.getNextPageUrl();
                       /* if (position == 1) {
                            Log.d("print", "----->onLoadMore: " + nextPageUrl);
                            SharedUtil.putString("allurl", nextPageUrl);
                        }*/

                    }
                });


    }


    /**
     * 分类全部的
     *
     * @param context
     * @param xRecyclerView
     * @param classifyAllAdapter
     * @param position
     */
    @Override
    public void doGetClassifyAllData(final Context context, final XRecyclerView xRecyclerView, final ClassifyAllAdapter classifyAllAdapter, final int position) {
        this.classifyAllAdapter = classifyAllAdapter;
        this.cAllRecyclerView = xRecyclerView;
        xRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        xRecyclerView.setAdapter(classifyAllAdapter);
        String viewpager_url = urlList.get(position);
        xRecyclerView.setPullRefreshEnabled(false);

        classifyAllAdapter.setMyClassifyClistener(new ClassifyAllAdapter.MyClassifyClistener() {
            @Override
            public void doClassifySuccess(View view, int position) {
                List<CHomeEntity.ItemListBeanX> datas = classifyAllAdapter.getDatas();
                CHomeEntity.ItemListBeanX.DataBeanX data = datas.get(position - 1).getData();
                String playUrl = data.getPlayUrl();
                String title = data.getTitle();
                String category = data.getCategory();
                String id = data.getId();
                String description = data.getDescription();
                String image = data.getCover().getDetail();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("id", id);
                intent.putExtra("description", description);
                intent.putExtra("category", category);
                intent.putExtra("url", playUrl);
                intent.putExtra("title", title);
                intent.putExtra("img", image);
                context.startActivity(intent);
            }
        });

        OkGo.get(viewpager_url)
                .tag(context)
                .cacheKey("viewlist")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        CHomeEntity cHomeEntity = JSON.parseObject(s, CHomeEntity.class);
                        List<CHomeEntity.ItemListBeanX> itemList = cHomeEntity.getItemList();
                        classifyAllAdapter.setDatas(itemList);
                        String nextPageUrl = cHomeEntity.getNextPageUrl();
                        SharedUtil.putString("allurl", nextPageUrl);


                    }
                });


        xRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                // xRecyclerView.refreshComplete();

            }

            @Override
            public void onLoadMore() {
                String allurl = SharedUtil.getString("allurl");
                getMoreAllData(allurl);
                // xRecyclerView.loadMoreComplete();

            }
        });

    }

    /**
     * 作者的数据
     *
     * @param context
     * @param xRecyclerView
     * @param classifyauthorAdapter
     * @param position
     */
    @Override
    public void doGetClassifyAuthorData(Context context, final XRecyclerView xRecyclerView, final ClassifyAuthorAdapter classifyauthorAdapter, int position) {
        this.classifyAuthorAdapter = classifyauthorAdapter;
        this.cBRecyclerView = xRecyclerView;
        xRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        xRecyclerView.setAdapter(classifyauthorAdapter);
        xRecyclerView.setPullRefreshEnabled(false);
        String viewpager_url = urlList.get(position);


        OkGo.get(viewpager_url)
                .tag(context)
                .cacheKey("viewlist")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        CAuthorEntity cHomeEntity = JSON.parseObject(s, CAuthorEntity.class);
                        List<CAuthorEntity.ItemListBeanX> itemList = cHomeEntity.getItemList();
                        classifyauthorAdapter.setDatas(itemList);
                        String nextPageUrl = cHomeEntity.getNextPageUrl();
                        Log.d("print", "onSuccess: " + nextPageUrl);
                        SharedUtil.putString("authorurl", nextPageUrl);


                    }
                });

        xRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                //xRecyclerView.refreshComplete();
            }

            @Override
            public void onLoadMore() {
                String authorurl = SharedUtil.getString("authorurl");
                getMoreAuthorData(authorurl);
                /*if (""!=authorurl){

                }else {
                    xRecyclerView.loadMoreComplete();
                }*/
                //xRecyclerView.loadMoreComplete();

            }
        });
    }

    /**
     * 作者获得更多
     *
     * @param url
     */
    private void getMoreAuthorData(String url) {
        OkGo.get(url)
                .tag(context)
                .cacheKey("viewlist")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        CAuthorEntity cHomeEntity = JSON.parseObject(s, CAuthorEntity.class);
                        List<CAuthorEntity.ItemListBeanX> itemList = cHomeEntity.getItemList();
                        classifyAuthorAdapter.addDatas(itemList);
                        itemList.clear();
                        String nextPageUrl = cHomeEntity.getNextPageUrl();
                        SharedUtil.putString("authorurl", nextPageUrl);


                    }

                    @Override
                    public void onAfter(String s, Exception e) {
                        super.onAfter(s, e);
                        cBRecyclerView.refreshComplete();
                        cBRecyclerView.loadMoreComplete();
                    }
                });


    }


    private void getMoreAllData(String url) {
        OkGo.get(url)
                .tag(context)
                .cacheKey("viewlist")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        CHomeEntity cHomeEntity = JSON.parseObject(s, CHomeEntity.class);
                        List<CHomeEntity.ItemListBeanX> itemList = cHomeEntity.getItemList();
                        classifyAllAdapter.addDatas(itemList);
                        String nextPageUrl = cHomeEntity.getNextPageUrl();


                        SharedUtil.putString("allurl", nextPageUrl);


                    }

                    @Override
                    public void onAfter(String s, Exception e) {
                        super.onAfter(s, e);
                        cAllRecyclerView.refreshComplete();
                        cAllRecyclerView.loadMoreComplete();
                    }
                });


    }

    private static final List<String> mTitles = new ArrayList<>();

    private static void initViewPager(ViewPager viewPager, MyPagerAdapter myPagerAdapter) {
        myPagerAdapter.addFragment(new CHomeFragment(), mTitles.get(0));
        myPagerAdapter.addFragment(new CAllFragment(), mTitles.get(1));
        myPagerAdapter.addFragment(new CAuthorFragment(), mTitles.get(2));
        myPagerAdapter.addFragment(new CAlbumFragment(), mTitles.get(3));
        viewPager.setAdapter(myPagerAdapter);
    }


    private void getClassifyDetail(final Context context) {
        OkGo.get(classifDetailyUrl)
                .tag(context)
                .cacheKey("classify")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        ClassifyDetailEntity classifyDetailEntity = new Gson().fromJson(s, ClassifyDetailEntity.class);
                        String name = classifyDetailEntity.getCategoryInfo().getName();
                        String description = classifyDetailEntity.getCategoryInfo().getDescription();
                        String headerImage = classifyDetailEntity.getCategoryInfo().getHeaderImage();
                        setImg(context, headerImage, imageView);
                        textView_name.setText(name);
                        textView_des.setText(description);
                        List<ClassifyDetailEntity.TabInfoBean.TabListBean> tabList = classifyDetailEntity.getTabInfo().getTabList();

                        urlList.clear();
                        for (int i = 0; i < tabList.size(); i++) {
                            mTitles.add(tabList.get(i).getName());
                            String apiUrl = tabList.get(i).getApiUrl();
                            urlList.add(apiUrl);
                        }


                        tabLayout.setupWithViewPager(mViewPager);
                        initViewPager(mViewPager, myPagerAdapter);
                        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                            @Override
                            public void onTabSelected(TabLayout.Tab tab) {

                            }

                            @Override
                            public void onTabUnselected(TabLayout.Tab tab) {

                            }

                            @Override
                            public void onTabReselected(TabLayout.Tab tab) {

                            }
                        });


                        //reFreshComplete(swipeRefreshLayout3);


                    }
                });
    }


    /**
     * 刷新结束
     *
     * @param swipeRefreshLayout
     */
    private static void reFreshComplete(final SwipeRefreshLayout swipeRefreshLayout) {
        swipeRefreshLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(false);
            }
        }, 500);
    }

    private void setImg(Context context, String imgUrl, ImageView imageView) {
        Glide.with(context.getApplicationContext()).load(imgUrl)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
    }


    private static void getRefrshClassify(final Context context) {
        OkGo.get(classifyUrl)
                .tag(context)
                .cacheKey("classify")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        ClassifyEntity classifyEntity = new Gson().fromJson(s, ClassifyEntity.class);
                        classifyAdapter.setDatas(classifyEntity.getItemList());
                        String classifyPageUrl = classifyEntity.getNextPageUrl();
                        SharedUtil.putString("classifyurl", classifyPageUrl);
                        swipeRefreshLayout2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                swipeRefreshLayout2.setRefreshing(false);
                            }
                        }, 500);

                    }

                    @Override
                    public void onAfter(String s, Exception e) {
                        super.onAfter(s, e);
                        cRecyclerView.loadMoreComplete();
                        cRecyclerView.refreshComplete();
                    }
                });
    }

    private void getMoreClassifyData(String url) {
        OkGo.get(url)
                .tag(context)
                .cacheKey("list")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {

                        ClassifyEntity classifyEntity = new Gson().fromJson(s, ClassifyEntity.class);
                        String nextPageUrl = classifyEntity.getNextPageUrl();
                        classifyAdapter.addDatas(classifyEntity.getItemList());
                        SharedUtil.putString("classifyurl", nextPageUrl);


                    }

                    @Override
                    public void onAfter(String s, Exception e) {
                        super.onAfter(s, e);

                        cRecyclerView.loadMoreComplete();
                        cRecyclerView.refreshComplete();

                    /*    if (SharedUtil.getString("classifyurl") != "") {

                            cRecyclerView.loadMoreComplete();
                            cRecyclerView.refreshComplete();

                        } else {
                            cRecyclerView.setNoMore(true);
                        }*/
                    }
                });


    }


    private static void getData(final Context context) {
        OkGo.get(requestUrl)
                .tag(context)
                .cacheKey("data")
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, final Call call, Response response) {
                        BanerEntity banerEntity = new Gson().fromJson(s, BanerEntity.class);
                        //此处获得是第二页的数据
                        String nextPageUrl = banerEntity.getNextPageUrl();

                        OkGo.get(nextPageUrl)
                                .tag(context)
                                .cacheKey("list")
                                .cacheMode(CacheMode.DEFAULT)
                                .execute(new StringCallback() {
                                    @Override
                                    public void onSuccess(String s, Call call, Response response) {
                                        BanerEntity banerEntity = new Gson().fromJson(s, BanerEntity.class);
                                        List<BanerEntity.IssueListBean.ItemListBean> itemList = banerEntity.getIssueList().get(0).getItemList();
                                        Iterator<BanerEntity.IssueListBean.ItemListBean> iterator = itemList.iterator();
                                        while (iterator.hasNext()) {
                                            BanerEntity.IssueListBean.ItemListBean bean = iterator.next();
                                            if (bean.getType().equals("banner2")) {
                                                iterator.remove();
                                            }
                                        }

                                        homeAdapter.setDatas(itemList);
                                        String nextPageUrl1 = banerEntity.getNextPageUrl();
                                        SharedUtil.putString("pageurl", nextPageUrl1);


                                        reFreshComplete(swipeRefreshLayout);


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

                        convenientBanner1.setPages(new CBViewHolderCreator() {
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
                                        BanerEntity.IssueListBean.ItemListBean.DataBean dataBanner = data.get(position).getData();
                                        String playUrl = dataBanner.getPlayUrl();
                                        String title = dataBanner.getTitle();
                                        String category = dataBanner.getCategory();
                                        String description = dataBanner.getDescription();
                                        String id = dataBanner.getId();
                                        Intent intent = new Intent(context, DetailActivity.class);
                                        intent.putExtra("id", id);
                                        intent.putExtra("description", description);
                                        intent.putExtra("category", category);
                                        intent.putExtra("url", playUrl);
                                        intent.putExtra("title", title);

                                        intent.putExtra("img", dataBanner.getCover().getDetail());
                                        context.startActivity(intent);
                                    }

                                });


                    }


                });


    }


    /**
     * 翻转效果
     *
     * @param convenientBanner
     */
    private void getTran(ConvenientBanner convenientBanner, int type) {
        transformerList.add(DepthPageTransformer.class.getSimpleName());
        transformerList.add(StackTransformer.class.getSimpleName());
        transformerList.add(ZoomInTransformer.class.getSimpleName());
        transformerList.add(ZoomOutTranformer.class.getSimpleName());

        String transforemerName = transformerList.get(type);
        try {
            Class cls = Class.forName("com.ToxicBakery.viewpager.transforms." + transforemerName);
            ABaseTransformer transforemer = (ABaseTransformer) cls.newInstance();
            convenientBanner.getViewPager().setPageTransformer(true, transforemer);

            //部分3D特效需要调整滑动速度
            if (transforemerName.equals("StackTransformer")) {
                convenientBanner.setScrollDuration(1200);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }


    private static final Handler mHandler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case REFRESH_COMPLETE:
                    requestUrl = firstUrl;
                    getData(context);
                    swipeRefreshLayout.setRefreshing(false);//停止转圈圈
                    break;


            }
        }


    };


    @Override
    public void doOnSuccessClick(View view, int position) {


        BanerEntity.IssueListBean.ItemListBean.DataBean data = homeAdapter.getDatas().get(position - 2).getData();
        String playUrl = data.getPlayUrl();
        String title = data.getTitle();
        Intent intent = new Intent(context, DetailActivity.class);

        String category = data.getCategory();
        String description = data.getDescription();
        String id = data.getId();
        intent.putExtra("url", playUrl);
        intent.putExtra("title", title);
        intent.putExtra("img", data.getCover().getDetail());
        intent.putExtra("id", id);
        intent.putExtra("description", description);
        intent.putExtra("category", category);

        context.startActivity(intent);
    }
}
