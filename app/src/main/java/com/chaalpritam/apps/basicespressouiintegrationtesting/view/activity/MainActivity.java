package com.chaalpritam.apps.basicespressouiintegrationtesting.view.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.chaalpritam.apps.basicespressouiintegrationtesting.R;
import com.chaalpritam.apps.basicespressouiintegrationtesting.view.fragment.MainFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setupToolbar(toolbar);

        startFragment(MainFragment.newInstance());
    }
}
