package com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.model

import android.util.Log
import javax.inject.Inject

/**
 *
 * Created by Nikolay Tkachenko on 03, December, 2020
 *
 */
class DieselEngine : Engine {

//    @Inject
//    constructor(){}

    override fun start() {
        System.out.println("Diesel Engine started.....")
        Log.d("DAGGER_TEST", "Diesel Engine started.....")
    }

}