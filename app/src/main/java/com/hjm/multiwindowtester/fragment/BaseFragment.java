package com.hjm.multiwindowtester.fragment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hjm.multiwindowtester.R;


abstract public class BaseFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log("onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        log("onCreateView()");

        View view = inflater.inflate(R.layout.fragment_base, container, false);
        TextView text = (TextView) view.findViewById(R.id.message);
        text.setText(getClassName());

        return view;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        log("onConfigurationChanged(): " + newConfig);
    }

    @Override
    public void onStart() {
        super.onStart();
        log("onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        log("onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        log("onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        log("onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        log("onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        log("onDestroy()");
    }

    abstract protected String getClassName();

    private void log(String message) {
        Log.i(getClassName(), message);
    }
}
