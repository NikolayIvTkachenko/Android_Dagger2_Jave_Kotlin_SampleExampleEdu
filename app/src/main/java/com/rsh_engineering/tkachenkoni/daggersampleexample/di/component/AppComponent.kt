package com.rsh_engineering.tkachenkoni.daggersampleexample.di.component

import com.rsh_engineering.tkachenkoni.daggersampleexample.data_domain.AppLogger
import com.rsh_engineering.tkachenkoni.daggersampleexample.di.module.AppModule
import com.rsh_engineering.tkachenkoni.daggersampleexample.di.scope.AppScope
import dagger.Component

/**
 *
 * Created by Nikolay Tkachenko on 02, October, 2020
 *
 */

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getAppLogger(): AppLogger
}