package com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.data_domain;

/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */

public interface LoginRepository {

    User getUser();
    void saveUser(User  user);

}
