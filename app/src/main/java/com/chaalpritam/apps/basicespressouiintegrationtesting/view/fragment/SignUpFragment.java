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
import com.chaalpritam.apps.basicespressouiintegrationtesting.presenter.SignUpContract;
import com.chaalpritam.apps.basicespressouiintegrationtesting.presenter.SignUpPresenter;
import com.chaalpritam.apps.basicespressouiintegrationtesting.view.activity.SuccessActivity;

/**
 * Created by chaalpritam on 11/4/17.
 */

public class SignUpFragment extends BaseFragment implements SignUpContract.View {

    private SignUpContract.UserActionListener userActionListener;

    private ProgressBar progressBar;

    public static SignUpFragment newInstance() {
        return new SignUpFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userActionListener = new SignUpPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button signUpButton = (Button)view.findViewById(R.id.button_sign_up);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userActionListener.handleSignUpButtonClick();
            }
        });

        progressBar = (ProgressBar) view.findViewById(R.id.progress_bar_indeterminate);
    }

    @Override
    public void showIndeterminateProgress(boolean visible) {
        progressBar.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    @Override
    public void showSuccessActivity() {
        Intent intent = new Intent(getActivity(), SuccessActivity.class);
        intent.putExtra(SuccessActivity.STATUS_MESSAGE, getString(R.string.text_sign_up_successful));
        startActivity(intent);
    }
}
