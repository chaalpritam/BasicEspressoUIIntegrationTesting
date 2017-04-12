package com.chaalpritam.apps.basicespressouiintegrationtesting.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.chaalpritam.apps.basicespressouiintegrationtesting.R;
import com.chaalpritam.apps.basicespressouiintegrationtesting.presenter.MainContract;
import com.chaalpritam.apps.basicespressouiintegrationtesting.presenter.MainPresenter;
import com.chaalpritam.apps.basicespressouiintegrationtesting.view.activity.LoginActivity;
import com.chaalpritam.apps.basicespressouiintegrationtesting.view.activity.SignUpActivity;

/**
 * Created by chaalpritam on 11/4/17.
 */

public class MainFragment extends BaseFragment implements MainContract.View {

    private MainContract.UserActionListener userActionListener;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        userActionListener = new MainPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //set up sign up button
        Button signUpButton = (Button) view.findViewById(R.id.button_sign_up);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userActionListener.signUp();
            }
        });

        //set up login button
        Button loginButton = (Button)view.findViewById(R.id.button_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userActionListener.login();
            }
        });

    }

    @Override
    public void showLoginScreen() {
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void showSignUpScreen() {
        Intent intent = new Intent(getActivity(), SignUpActivity.class);
        startActivity(intent);
    }
}
