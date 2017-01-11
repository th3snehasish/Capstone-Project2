package com.th3snehasish.tripit.Utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Snehasish Nayak on 01/01/17.
 */
public class MyBoldTextView extends TextView {

    public MyBoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setType(context);
    }

    public MyBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setType(context);
    }

    public MyBoldTextView(Context context) {
        super(context);
        setType(context);
    }

    private void setType(Context context) {
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),
                "Rosario-Bold.ttf"));
    }
}