package com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin.di.DaggerCarComponent

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin.di.modules.PetrolEngineModule
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_07_edu_kotlin.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var carComponent = DaggerCarComponent
            .builder()
            .powerCapacity(300)
            .build()

        carComponent.inject(this)

        car.start()

    }
}
