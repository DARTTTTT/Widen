package com.wrg.widen.MyRecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.wrg.widen.R;

/**
 * Created by 翁 on 2017/9/1.
 */

public class SampleHeader extends RelativeLayout {

    public SampleHeader(Context context) {
        super(context);
        init(context);
    }

    public SampleHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public SampleHeader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init(Context context) {

        inflate(context, R.layout.layout_head_banner, this);
    }
}

