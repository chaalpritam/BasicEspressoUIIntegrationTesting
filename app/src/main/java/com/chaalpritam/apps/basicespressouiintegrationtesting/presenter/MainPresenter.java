package com.chaalpritam.apps.basicespressouiintegrationtesting.presenter;

import android.support.annotation.NonNull;

/**
 * Created by chaalpritam on 11/4/17.
 */

public class MainPresenter implements MainContract.UserActionListener {

    private MainContract.View mainView;

    public MainPresenter(@NonNull MainContract.View mainView) {
        this.mainView = mainView;
    }

    @Override
    public void signUp() {
        mainView.showSignUpScreen();
    }

    @Override
    public void login() {
        mainView.showLoginScreen();
    }
}
