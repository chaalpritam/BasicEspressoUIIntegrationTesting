package com.chaalpritam.apps.basicespressouiintegrationtesting.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.chaalpritam.apps.basicespressouiintegrationtesting.R;

/**
 * Created by chaalpritam on 11/4/17.
 */

public class SuccessActivity extends BaseActivity {

    public static final String STATUS_MESSAGE = "message";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        String message = getIntent().getStringExtra(STATUS_MESSAGE);
        TextView textView = (TextView)findViewById(R.id.text_view_status_message);
        textView.setText(message);
    }
}
