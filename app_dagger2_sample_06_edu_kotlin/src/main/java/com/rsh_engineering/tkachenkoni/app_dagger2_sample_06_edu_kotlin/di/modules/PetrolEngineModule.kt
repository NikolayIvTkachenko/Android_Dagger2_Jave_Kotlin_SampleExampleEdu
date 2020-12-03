package com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.di.modules

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.model.Engine
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.model.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 *
 * Created by Nikolay Tkachenko on 03, December, 2020
 *
 */

@Module
class  PetrolEngineModule {

//    @Binds
////    abstract fun providesPetrolEngine(petrolEngine: PetrolEngine): Engine

    @Provides
    fun providesPetrolEngine() : Engine{
        return PetrolEngine(100)
    }


}