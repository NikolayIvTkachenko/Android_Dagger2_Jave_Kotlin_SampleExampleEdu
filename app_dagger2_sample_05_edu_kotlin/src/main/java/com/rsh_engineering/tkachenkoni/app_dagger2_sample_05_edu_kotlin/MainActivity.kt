package com.rsh_engineering.tkachenkoni.app_dagger2_sample_05_edu_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_04_edu_kotlin.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var car1: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carComponent = DaggerCarComponent.create()
        carComponent.inject(this)

        car.start()

        car1.start()
    }
}
