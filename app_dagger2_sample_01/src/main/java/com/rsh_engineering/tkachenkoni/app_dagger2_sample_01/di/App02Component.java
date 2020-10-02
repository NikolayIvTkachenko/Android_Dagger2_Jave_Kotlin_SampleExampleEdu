package com.rsh_engineering.tkachenkoni.app_dagger2_sample_01.di;

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_01.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface App02Component {

    void inject (MainActivity activity);

}
