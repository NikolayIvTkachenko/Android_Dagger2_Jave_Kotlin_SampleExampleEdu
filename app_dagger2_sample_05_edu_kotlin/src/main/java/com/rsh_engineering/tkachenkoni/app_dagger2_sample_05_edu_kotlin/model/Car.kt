package com.rsh_engineering.tkachenkoni.app_dagger2_sample_04_edu_kotlin.model

import android.util.Log
import javax.inject.Inject

/**
 *
 * Created by Nikolay Tkachenko on 03, December, 2020
 *
 */
class Car {

    lateinit var wheels: Wheels
    lateinit var engine: Engine

    @Inject
    constructor(wheels: Wheels, engine: Engine){
        this.wheels = wheels
        this.engine = engine
    }

    fun start(){
        System.out.println("driving.....")
        Log.d("DAGGER_TEST", "driving.....")
    }


}