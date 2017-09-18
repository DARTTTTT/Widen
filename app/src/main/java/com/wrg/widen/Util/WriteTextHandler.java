package com.wrg.widen.Util;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

/**
 * Created by 翁 on 2017/8/31.
 */

public class WriteTextHandler extends Handler {
    private final CharSequence content;
    private int hanlderLen;
    private int showTotalWords;
    private final TextView textView;

    public WriteTextHandler(TextView paramTextView,
                            CharSequence paramCharSequence) {
        this.textView = paramTextView;
        this.content = paramCharSequence;
    }

    public void handleMessage(Message paramMessage) {
        this.hanlderLen--;
        if (hanlderLen == 0) {
            textView.setText(this.content);
            return;
        }
        this.showTotalWords += 1;
        int j = Math.min(this.content.length(), this.showTotalWords);
        textView.setText(this.content.subSequence(0, j));
        sendEmptyMessageDelayed(1, 50);
    }

    public void setText() {

        this.hanlderLen = this.content.length();

        textView.setText("");
        removeMessages(1);
        sendEmptyMessageDelayed(1, 50);
    }
}
