package com.rsh_engineering.tkachenkoni.daggersampleexample

import android.app.Application
import android.content.Context
import com.rsh_engineering.tkachenkoni.daggersampleexample.di.component.AppComponent
import com.rsh_engineering.tkachenkoni.daggersampleexample.di.component.DaggerAppComponent
import com.rsh_engineering.tkachenkoni.daggersampleexample.di.component.DaggerLoginComponent
import com.rsh_engineering.tkachenkoni.daggersampleexample.di.component.LoginComponent
import com.rsh_engineering.tkachenkoni.daggersampleexample.di.module.AppModule
import com.rsh_engineering.tkachenkoni.daggersampleexample.di.module.LocalStoreModule

/**
 *
 * Created by Nikolay Tkachenko on 02, October, 2020
 *
 */
class App: Application() {

    lateinit var appComponent : AppComponent
    lateinit var loginComponent : LoginComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().appModule(AppModule()).build()
        loginComponent  = DaggerLoginComponent.builder()
            .localStoreModule(LocalStoreModule()).build()
    }
}

val Context.app: App
    get() = applicationContext as App