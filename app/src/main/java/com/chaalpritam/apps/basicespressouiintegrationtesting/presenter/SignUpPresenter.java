package com.chaalpritam.apps.basicespressouiintegrationtesting.presenter;

/**
 * Created by chaalpritam on 11/4/17.
 */

public class SignUpPresenter implements SignUpContract.UserActionListener {

    private SignUpContract.View signUpView;

    public SignUpPresenter(SignUpContract.View signUpView) {
        this.signUpView = signUpView;
    }

    @Override
    public void handleSignUpButtonClick() {
        signUpView.showIndeterminateProgress(false);
        signUpView.showSuccessActivity();

//        signUpView.showIndeterminateProgress(true);
//
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                signUpView.showIndeterminateProgress(false);
//                signUpView.showSuccessActivity();
//            }
//        }, 3000);
    }
}
