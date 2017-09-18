package com.wrg.widen.MyRecyclerview;

import android.view.View;

/**
 * Created by 翁 on 2017/9/1.
 */

public interface OnListLoadNextPageListener {
    /**
     * 开始加载下一页
     *
     * @param view 当前RecyclerView/ListView/GridView
     */
    void onLoadNextPage(View view);
}
