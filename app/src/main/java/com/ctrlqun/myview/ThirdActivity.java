package com.ctrlqun.myview;

import android.os.Bundle;

import com.ctrlqun.myview.view.BottomBarView;

public class ThirdActivity extends BottomBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_third);
        ((BottomBarView) findViewById(R.id.bottom_button_group)).setOnButtonListener(this);
    }
}
