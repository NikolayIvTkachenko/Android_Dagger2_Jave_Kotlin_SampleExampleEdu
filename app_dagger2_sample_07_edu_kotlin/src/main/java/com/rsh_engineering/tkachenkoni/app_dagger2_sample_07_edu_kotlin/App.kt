package com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin

import android.app.Application
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin.di.CarComponent
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin.di.DaggerCarComponent

/**
 *
 * Created by Nikolay Tkachenko on 03, December, 2020
 *
 */
class App : Application() {

    lateinit var carComponent : CarComponent

    override fun onCreate() {
        super.onCreate()

        carComponent = DaggerCarComponent
            .builder()
            .powerCapacity(300)
            .build()

    }

    fun carComponent():CarComponent{
        return carComponent
    }

}