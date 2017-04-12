package com.chaalpritam.apps.basicespressouiintegrationtesting.presenter;

/**
 * Created by chaalpritam on 11/4/17.
 */

public interface MainContract {

    interface View {

        void showLoginScreen();

        void showSignUpScreen();
    }

    interface UserActionListener {

        void signUp();

        void login();
    }
}
