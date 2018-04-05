package com.ctrlqun.myview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ctrlqun.myview.view.BottomBarView;

public class BottomBarActivity extends AppCompatActivity implements BottomBarView.OnButtonListener {
    public static String TAG = "BottomBarActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = getComponentName().getClassName();
    }

    @Override
    public void GoToFirstView() {
        goToFirstView();
    }

    @Override
    public void GoToSecondView() {
        goToSecondView();
    }

    @Override
    public void GoToThirdView() {
        goToThirdView();
    }

    private void goToFirstView() {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    private void goToSecondView() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    private void goToThirdView() {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
