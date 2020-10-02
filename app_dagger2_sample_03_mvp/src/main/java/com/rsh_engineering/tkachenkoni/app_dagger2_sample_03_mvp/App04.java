package com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp;

import android.app.Application;

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.di.App04Component;
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.di.App04Module;
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.di.DaggerApp04Component;
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.di.LoginModule;


/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */

public class App04 extends Application {

    private App04Component component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApp04Component.builder()
                .app04Module(new App04Module(this))
                .loginModule(new LoginModule())
                .build();
    }

    public App04Component getComponent(){
        return component;
    }

}
