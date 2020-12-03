package com.rsh_engineering.tkachenkoni.app_dagger2_sample_06_edu_kotlin.model

import javax.inject.Inject

/**
 *
 * Created by Nikolay Tkachenko on 03, December, 2020
 *
 */
class Wheels {

    lateinit var rims: Rims
    lateinit var tires: Tires

    constructor(rims: Rims, tires: Tires){
        this.rims = rims
        this.tires = tires
    }

}