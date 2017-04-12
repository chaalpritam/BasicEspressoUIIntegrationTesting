package com.chaalpritam.apps.basicespressouiintegrationtesting.presenter;

/**
 * Created by chaalpritam on 11/4/17.
 */

public interface LoginContract {

    interface View {

        void showProgressDialog(boolean visible);

        void showLoginSuccessScreen();
    }

    interface UserActionListener {

        void loginButtonClick();
    }
}
