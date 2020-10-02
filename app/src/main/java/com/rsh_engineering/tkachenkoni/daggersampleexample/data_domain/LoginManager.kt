package com.rsh_engineering.tkachenkoni.daggersampleexample.data_domain

import android.util.Log
import javax.inject.Inject

/**
 *
 * Created by Nikolay Tkachenko on 02, October, 2020
 *
 */

class LoginManager @Inject constructor(val localStore:LocalStore, val apiService:ApiService){

    fun login(username : String, password: String){
        Log.d("DAGGER_USE_TEST", "login($username, $password)")
    }

    @Inject
    fun enableCache(cache: Cache){
        cache.registerCache(this)
    }
}