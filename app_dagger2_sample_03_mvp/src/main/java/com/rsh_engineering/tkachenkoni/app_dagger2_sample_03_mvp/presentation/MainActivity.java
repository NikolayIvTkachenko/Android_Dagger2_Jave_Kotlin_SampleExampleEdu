package com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.presentation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.App04;
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.R;

/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App04)getApplication()).getComponent().inject(this);


    }
}
