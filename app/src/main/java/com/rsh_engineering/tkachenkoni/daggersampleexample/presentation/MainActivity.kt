package com.rsh_engineering.tkachenkoni.daggersampleexample.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rsh_engineering.tkachenkoni.daggersampleexample.App
import com.rsh_engineering.tkachenkoni.daggersampleexample.R
import com.rsh_engineering.tkachenkoni.daggersampleexample.app
import com.rsh_engineering.tkachenkoni.daggersampleexample.data_domain.LoginManager
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //Use debug logcat and key "DAGGER_USE_TEST"

    @Inject
    lateinit var loginManager : LoginManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        //Use injection without dagger
        val localStore = LocalStore("test store")
        val apiService = ApiService("nikolay","12345")
        val manager = LoginManager(localStore, apiService)

        loginManager = loginComponent.getLoginManager()
        loginManager?.login("nikolay", "12345")
         */

        //Use injection use Dagger
        val loginComponent = applicationContext.app.loginComponent
        loginComponent.injectMainActivity(this)

        loginManager.login("nikolay", "12345")

    }

}