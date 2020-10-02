package com.rsh_engineering.tkachenkoni.app_dagger2_sample_02

import android.app.Application
import android.content.Context
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_02.di.DaggerSampleComponent
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_02.di.SampleComponent

/**
 *
 * Created by Nikolay Tkachenko on 02, October, 2020
 *
 */
class App03: Application() {

    lateinit var sampleComponent : SampleComponent

    override fun onCreate() {
        super.onCreate()
        sampleComponent = DaggerSampleComponent.create()
    }
}


val Context.app03: App03
    get() = applicationContext as App03