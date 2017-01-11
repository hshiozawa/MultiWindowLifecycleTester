package com.hjm.multiwindowtester.activity;

import android.support.v4.app.Fragment;

import com.hjm.multiwindowtester.fragment.SubFragment;

public class SubActivity extends BaseActivity {
    private static String CLASS_NAME = SubActivity.class.getSimpleName();

    @Override
    protected String getClassName() {
        return CLASS_NAME;
    }

    @Override
    protected Fragment getTargetFragment() {
        return new SubFragment();
    }
}
