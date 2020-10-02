package com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.presentation;

import android.util.Log;

import androidx.annotation.Nullable;

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.data_domain.User;

/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */

public class LoginActivityPresenter implements LoginActivityMVP.Presenter {

    @Nullable
    private LoginActivityMVP.View view;
    private LoginActivityMVP.Model model;

    public LoginActivityPresenter(LoginActivityMVP.Model model) {
        this.model = model;
    }


    @Override
    public void setView(LoginActivityMVP.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonClicked() {
        Log.d("APPMVP5", "LoginActivityPresenter loginButtonClicked() ");
        if (view != null) {
            if (view.getFirstName().trim().equals("") ||
                    view.getLastName().trim().equals("")) {
                view.showInputError();
            } else {

                model.createUser(view.getFirstName(), view.getLastName());
                view.showUserSavedMessage();
            }
        }

    }

    @Override
    public void getCurrentUser() {
        Log.d("APP_DAGGER_MVP", "LoginActivityPresenter getCurrentUser() ");

        User user = model.getUser();

        if (user == null) {
            if (view != null) {
                view.showUserNotAvailable();
            }
        } else {
            if (view != null) {
                view.setFirstName(user.getFirstName());
                view.setLastName(user.getLastName());

            }
        }
    }
}

