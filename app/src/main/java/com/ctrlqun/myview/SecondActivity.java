package com.ctrlqun.myview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ctrlqun.myview.view.BottomBarView;

public class SecondActivity extends BottomBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ((BottomBarView) findViewById(R.id.bottom_button_group)).setOnButtonListener(this);
    }
}
