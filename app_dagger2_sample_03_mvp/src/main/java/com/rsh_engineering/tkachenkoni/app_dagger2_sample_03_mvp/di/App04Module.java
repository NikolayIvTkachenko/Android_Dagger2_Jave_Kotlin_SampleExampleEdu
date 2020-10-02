package com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */

@Module
public class App04Module {

    private Application application;

    public App04Module(Application application){
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }

}
