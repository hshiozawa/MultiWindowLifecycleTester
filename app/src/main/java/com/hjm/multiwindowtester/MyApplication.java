package com.hjm.multiwindowtester;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;


public class MyApplication extends Application {
    private static final String TAG = MyApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        log("onCreate()");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        log("onConfigurationChanged(): " + newConfig);
    }

    private static void log(String message) {
        Log.i(TAG, message);
    }
}
