package com.rsh_engineering.tkachenkoni.app_dagger2_sample_01;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App02) getApplication()).getComponent().inject(this);



    }
}
