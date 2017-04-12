package com.chaalpritam.apps.basicespressouiintegrationtesting.presenter;

/**
 * Created by chaalpritam on 11/4/17.
 */

public class LoginPresenter implements LoginContract.UserActionListener {

    private LoginContract.View loginView;

    public LoginPresenter(LoginContract.View loginView) {
        this.loginView = loginView;
    }

    @Override
    public void loginButtonClick() {
        loginView.showProgressDialog(false);
        loginView.showLoginSuccessScreen();

//        loginView.showProgressDialog(true);
//
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                loginView.showProgressDialog(false);
//                loginView.showLoginSuccessScreen();
//            }
//        }, 3000);
    }
}
