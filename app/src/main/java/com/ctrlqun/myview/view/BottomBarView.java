package com.ctrlqun.myview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.ctrlqun.myview.R;

public class BottomBarView extends LinearLayout implements View.OnClickListener {
    OnButtonListener buttonListener;

    public BottomBarView(Context context) {
        super(context);
        inflateView();
    }

    public BottomBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateView();
    }

    private void inflateView() {
        inflate(getContext(), R.layout.layout_bottombar, this);
        ((Button) findViewById(R.id.id_btn_firstview)).setOnClickListener(this);
        ((Button) findViewById(R.id.id_btn_secondview)).setOnClickListener(this);
        ((Button) findViewById(R.id.id_btn_thirdview)).setOnClickListener(this);
    }

    public void setOnButtonListener(OnButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }

    @Override
    public void onClick(View view) {
        if (buttonListener == null) {
            return;
        }
        if (view.getId() == R.id.id_btn_firstview) {
            buttonListener.GoToFirstView();
        } else if (view.getId() == R.id.id_btn_secondview) {
            buttonListener.GoToSecondView();
        } else if (view.getId() == R.id.id_btn_thirdview) {
            buttonListener.GoToThirdView();
        }
    }

    public interface OnButtonListener {
        public void GoToFirstView();

        public void GoToSecondView();

        public void GoToThirdView();
    }
}
