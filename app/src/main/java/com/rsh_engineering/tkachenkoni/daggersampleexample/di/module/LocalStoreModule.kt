package com.rsh_engineering.tkachenkoni.daggersampleexample.di.module

import com.rsh_engineering.tkachenkoni.daggersampleexample.data_domain.LocalStore
import dagger.Module
import dagger.Provides

/**
 *
 * Created by Nikolay Tkachenko on 02, October, 2020
 *
 */

@Module
class LocalStoreModule {
    @Provides
    fun privideLocalStore() = LocalStore()
}