package com.example.yzt.studiodemo;

import android.app.Application;

import org.xutils.x;

/**
 * Created by YZT on 2016/8/31.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
    }
}
