package com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.di;

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.presentation.LoginActivity;
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.presentation.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */
@Singleton
@Component(modules =  {App04Module.class, LoginModule.class})
public interface ApplicationComponent {

    void inject(MainActivity target);

    void inject(LoginActivity target);

}