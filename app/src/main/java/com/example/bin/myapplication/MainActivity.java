package com.example.bin.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    private Context context;
    RecyclerView recyclerView;
    GestureDetector gestureDetector ;
//    RecyclerView.Adapter
//    LinearLayoutManager

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);
        int value = 0;
        RequestQueue mQueue = Volley.newRequestQueue(context);

    }

    public void startPackage(String packageName)
    {

        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        // 这里面的值是你要跳转app的包名，你跳转的清单文件里的package名
        intent = packageManager.getLaunchIntentForPackage(packageName);
        context.startActivity(intent);
    }
}
