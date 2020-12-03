package com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.di.modules

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.model.Rims
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.model.Tires
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.model.Wheels
import dagger.Module
import dagger.Provides

/**
 *
 * Created by Nikolay Tkachenko on 03, December, 2020
 *
 */

@Module
class WheelsModule {

    @Provides
    fun providesRims():Rims{
        return  Rims()
    }

    @Provides
    fun providesTires():Tires{
        return Tires()
    }

    @Provides
    fun providesWheels(rims: Rims, tires: Tires):Wheels{
        return Wheels(rims, tires)
    }

}