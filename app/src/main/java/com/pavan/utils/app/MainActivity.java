package com.pavan.utils.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.pavan.utils.Utility;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utility.showToast(MainActivity.this);
            }
        });

    }
}
