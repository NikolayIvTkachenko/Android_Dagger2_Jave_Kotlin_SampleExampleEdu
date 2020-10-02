package com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.data_domain;

import android.util.Log;

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.presentation.LoginActivityMVP;

/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */

public class LoginModel implements LoginActivityMVP.Model{

    private LoginRepository repository;

    public LoginModel(LoginRepository repository){
        this.repository = repository;
    }


    @Override
    public void createUser(String fname, String lname) {
        Log.d("APP_DAGGER_MVP", "LoginModel createUser");
        repository.saveUser(new User(fname, lname));
    }

    @Override
    public User getUser() {

        Log.d("APP_DAGGER_MVP", "LoginModel getUser()");
        return repository.getUser();
    }
}
