package com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.model

import android.util.Log
import javax.inject.Inject

/**
 *
 * Created by Nikolay Tkachenko on 03, December, 2020
 *
 */
class Remote {

    lateinit var car: Car

    @Inject
    constructor(){

    }

    fun provideCar(car:Car){
        Log.d("DAGGER_TEST", "providing car to remote .....")
        this.car = car
    }

}