package com.chaalpritam.apps.basicespressouiintegrationtesting.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.chaalpritam.apps.basicespressouiintegrationtesting.R;
import com.chaalpritam.apps.basicespressouiintegrationtesting.presenter.LoginContract;
import com.chaalpritam.apps.basicespressouiintegrationtesting.presenter.LoginPresenter;
import com.chaalpritam.apps.basicespressouiintegrationtesting.view.activity.SuccessActivity;

/**
 * Created by chaalpritam on 11/4/17.
 */

public class LoginFragment extends BaseFragment implements LoginContract.View {

    private LoginContract.UserActionListener userActionListener;
    private ProgressBar progressBar;

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userActionListener = new LoginPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = (Button)view.findViewById(R.id.button_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userActionListener.loginButtonClick();
            }
        });

        progressBar = (ProgressBar)view.findViewById(R.id.progress_bar_login);
    }

    @Override
    public void showProgressDialog(boolean visible) {
        progressBar.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    @Override
    public void showLoginSuccessScreen() {
        Intent intent = new Intent(getActivity(), SuccessActivity.class);
        intent.putExtra(SuccessActivity.STATUS_MESSAGE, getString(R.string.text_login_successful));
        startActivity(intent);
    }
}
