package com.ctrlqun.myview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ctrlqun.myview.R;

public class FirstView extends RelativeLayout {

    private Button mLeftBtn;
    private TextView mTitleTv;

    public FirstView(Context context) {
        super(context);
    }

    public FirstView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.layout_firstview, this);
        mLeftBtn = (Button) findViewById(R.id.left_btn);
        mTitleTv = (TextView) findViewById(R.id.title_tv);
    }

    public void setLeftButtonListener(OnClickListener listener) {
        mLeftBtn.setOnClickListener(listener);
    }

    public void setTitleText(String title) {
        mTitleTv.setText(title);
    }
}
