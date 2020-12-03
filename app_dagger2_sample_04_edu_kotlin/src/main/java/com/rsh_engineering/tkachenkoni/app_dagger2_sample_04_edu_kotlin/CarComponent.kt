package com.rsh_engineering.tkachenkoni.app_dagger2_sample_04_edu_kotlin

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_04_edu_kotlin.model.Car
import dagger.Component

/**
 *
 * Created by Nikolay Tkachenko on 03, December, 2020
 *
 */

@Component
interface CarComponent {

    fun getCar(): Car

}