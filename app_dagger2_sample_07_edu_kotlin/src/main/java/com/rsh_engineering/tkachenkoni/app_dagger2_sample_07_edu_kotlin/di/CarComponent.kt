package com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin.di

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin.MainActivity
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin.di.modules.DieselEngineModule
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin.di.modules.PetrolEngineModule
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin.di.modules.WheelsModule
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin.model.Car
import dagger.BindsInstance
import dagger.Component

/**
 *
 * Created by Nikolay Tkachenko on 03, December, 2020
 *
 */

@Component(modules = [
    PetrolEngineModule::class,
    //DieselEngineModule::class,
    WheelsModule::class
])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun powerCapacity(powerCapacity : Int) : Builder

        fun build(): CarComponent

    }

}