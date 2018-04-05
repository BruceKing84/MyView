package com.ctrlqun.myview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ctrlqun.myview.view.BottomBarView;

public class MainActivity extends BottomBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((BottomBarView) findViewById(R.id.bottom_button_group)).setOnButtonListener(this);
    }
}
