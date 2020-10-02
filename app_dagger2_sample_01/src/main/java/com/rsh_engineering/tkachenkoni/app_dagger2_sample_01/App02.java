package com.rsh_engineering.tkachenkoni.app_dagger2_sample_01;

import android.app.Application;

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_01.di.App02Component;
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_01.di.ApplicationModule;
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_01.di.DaggerApp02Component;


/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */

public class App02 extends Application {

    private App02Component component;



    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApp02Component.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public App02Component getComponent() {
        return component;
    }

}
