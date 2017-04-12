package com.chaalpritam.apps.basicespressouiintegrationtesting.presenter;

/**
 * Created by chaalpritam on 11/4/17.
 */

public interface SignUpContract {

    interface View {

        void showIndeterminateProgress(boolean visible);

        void showSuccessActivity();
    }

    interface UserActionListener {

        void handleSignUpButtonClick();
    }
}
