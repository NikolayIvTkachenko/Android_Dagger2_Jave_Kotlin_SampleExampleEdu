package com.rsh_engineering.tkachenkoni.daggersampleexample.di.module

import com.rsh_engineering.tkachenkoni.daggersampleexample.data_domain.ApiService
import com.rsh_engineering.tkachenkoni.daggersampleexample.data_domain.HttpService
import dagger.Binds
import dagger.Module

/**
 *
 * Created by Nikolay Tkachenko on 02, October, 2020
 *
 */

@Module
abstract class HttpServiceModule {

    @Binds
    abstract fun provideApiService(httpService: HttpService): ApiService

}