package com.rsh_engineering.tkachenkoni.daggersampleexample.di.module

import com.rsh_engineering.tkachenkoni.daggersampleexample.data_domain.AppLogger
import com.rsh_engineering.tkachenkoni.daggersampleexample.di.scope.AppScope
import dagger.Module
import dagger.Provides

/**
 *
 * Created by Nikolay Tkachenko on 02, October, 2020
 *
 */

@Module
class AppModule {

    private var index = 0

    @Provides
    @AppScope
    fun provideAppLogger(): AppLogger {
        index++
        return AppLogger("App Loger Index: $index")
    }
}