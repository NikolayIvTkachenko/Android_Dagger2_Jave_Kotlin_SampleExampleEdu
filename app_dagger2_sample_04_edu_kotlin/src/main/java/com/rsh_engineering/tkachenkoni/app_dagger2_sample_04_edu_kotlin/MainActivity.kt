package com.rsh_engineering.tkachenkoni.app_dagger2_sample_04_edu_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_04_edu_kotlin.model.Car

class MainActivity : AppCompatActivity() {

    lateinit var car: Car


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //without dagger
        //var wheels = Wheels()
        //var engine = Engine()
        //car = Car(wheels, engine)

        car = DaggerCarComponent.create().getCar()

        car.start()

    }
}
