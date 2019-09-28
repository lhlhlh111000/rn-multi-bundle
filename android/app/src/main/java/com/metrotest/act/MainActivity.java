package com.metrotest.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.metrotest.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        ReactInstanceManager reactInstanceManager = ((ReactApplication)getApplication()).getReactNativeHost().getReactInstanceManager();
        if (!reactInstanceManager.hasStartedCreatingInitialContext()) {
            reactInstanceManager.createReactContextInBackground();//这里会先加载基础包platform.android.bundle，也可以不加载
        }

        findViewById(R.id.btn_page_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchPage(Page2Activity.class);
            }
        });
        findViewById(R.id.btn_page_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchPage(Page3Activity.class);
            }
        });
        findViewById(R.id.btn_page_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchPage(Page4Activity.class);
            }
        });

        findViewById(R.id.btn_page_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchPage(TestPageActivity.class);
            }
        });
    }

    private void switchPage(Class targetPage) {
        startActivity(new Intent(this, targetPage));
    }
}