package com.zjfsharp.festec.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zjfsharp.latte.app.Latte;

//全局只持有单个Activity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Latte.init(this).withApiHost("http://127.0.0.1/").configure(); //简易的标准初始化模式，规范

    }
}
