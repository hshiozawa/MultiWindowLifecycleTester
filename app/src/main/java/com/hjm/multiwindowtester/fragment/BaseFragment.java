package com.hjm.multiwindowtester.fragment;

import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hjm.multiwindowtester.R;


abstract public class BaseFragment extends Fragment {

    private TextView size = null;
    private TextView realSize = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log("onCreate()");
    }

    private Point getWindowSize() {
        Point out = new Point();
        getActivity().getWindowManager().getDefaultDisplay().getSize(out);
        return out;
    }

    private Point getRealWindowSize() {
        Point out = new Point();
        getActivity().getWindowManager().getDefaultDisplay().getRealSize(out);
        return out;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        log("onCreateView()");

        View view = inflater.inflate(R.layout.fragment_base, container, false);
        TextView text = (TextView) view.findViewById(R.id.message);
        text.setText(getClassName());

        size = (TextView) view.findViewById(R.id.size);
        realSize = (TextView) view.findViewById(R.id.realSize);

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

        updateSizeInfo();

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

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        updateSizeInfo();
    }

    private void updateSizeInfo() {
        if (size != null) {
            size.setText("getSize(): " + getWindowSize());
        }

        if (realSize != null) {
            realSize.setText("getRealSize(): " + getRealWindowSize());
        }
    }

    abstract protected String getClassName();

    private void log(String message) {
        Log.i(getClassName(), message);
    }
}
