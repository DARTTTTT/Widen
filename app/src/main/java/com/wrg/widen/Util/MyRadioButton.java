package com.wrg.widen.Util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/**
 * Created by 翁 on 2017/9/6.
 */

public class MyRadioButton extends android.support.v7.widget.AppCompatRadioButton{
    public MyRadioButton(Context context) {
        super(context);
    }

    public MyRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable[] drawables = getCompoundDrawables();
        Drawable drawable = drawables[0];
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        int gravity = getGravity();
        int bottom = 0;
        if (gravity == Gravity.CENTER) {
            bottom = ((int) (getHeight() / 2 ));
        }
        drawable.setBounds(bottom, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()+bottom);
    }
}
