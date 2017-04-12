package com.chaalpritam.apps.basicespressouiintegrationtesting.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.chaalpritam.apps.basicespressouiintegrationtesting.R;
import com.chaalpritam.apps.basicespressouiintegrationtesting.view.fragment.LoginFragment;

/**
 * Created by chaalpritam on 11/4/17.
 */

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.tool_bar_title_login);
        setupToolbar(toolbar);

        startFragment(LoginFragment.newInstance());
    }
}
