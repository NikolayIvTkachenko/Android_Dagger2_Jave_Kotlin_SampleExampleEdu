package com.rsh_engineering.tkachenkoni.app_dagger2_sample_02.di

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_02.MainActivity
import dagger.Component

/**
 *
 * Created by Nikolay Tkachenko on 02, October, 2020
 *
 */

@Component
interface SampleComponent {

    fun doSomething(app: MainActivity)

}