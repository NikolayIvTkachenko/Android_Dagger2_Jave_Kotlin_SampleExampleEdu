package com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.di.modules

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.model.DieselEngine
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.model.Engine
import dagger.Binds

import dagger.Module
import dagger.Provides

/**
 *
 * Created by Nikolay Tkachenko on 03, December, 2020
 *
 */

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun providesDieselEngine(dieselEngine: DieselEngine): Engine

}