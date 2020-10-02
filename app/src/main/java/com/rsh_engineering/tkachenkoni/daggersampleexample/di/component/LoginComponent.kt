package com.rsh_engineering.tkachenkoni.daggersampleexample.di.component

import com.rsh_engineering.tkachenkoni.daggersampleexample.data_domain.LoginManager
import com.rsh_engineering.tkachenkoni.daggersampleexample.di.module.HttpServiceModule
import com.rsh_engineering.tkachenkoni.daggersampleexample.di.module.LocalStoreModule
import com.rsh_engineering.tkachenkoni.daggersampleexample.presentation.MainActivity
import dagger.Component

/**
 *
 * Created by Nikolay Tkachenko on 02, October, 2020
 *
 */

@Component(modules = [LocalStoreModule::class, HttpServiceModule::class])
interface LoginComponent {

    fun getLoginManager(): LoginManager

    fun injectMainActivity(mainActivity: MainActivity)

}