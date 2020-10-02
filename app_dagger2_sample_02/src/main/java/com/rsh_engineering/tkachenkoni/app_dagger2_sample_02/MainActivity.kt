package com.rsh_engineering.tkachenkoni.app_dagger2_sample_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_02.data_domain.BussinesLogic
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_02.di.DaggerSampleComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var bussinesLogic: BussinesLogic

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Create in MainActivity
        //DaggerSampleComponent.create().doSomething(this)

        //But it need use in App, because App is singleton
        applicationContext.app03.sampleComponent.doSomething(this)

        //Use synthetic
        action_txt.text = bussinesLogic.textDoSomething

    }
}
