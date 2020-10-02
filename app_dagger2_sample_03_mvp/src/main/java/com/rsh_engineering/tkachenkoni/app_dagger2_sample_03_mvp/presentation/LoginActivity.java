package com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.presentation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.App04;
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.R;

import javax.inject.Inject;

/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View{

    @Inject
    LoginActivityMVP.Presenter presenter;

    private EditText firstName;
    private EditText lastName;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ((App04)getApplication()).getComponent().inject(this);


        firstName = (EditText)findViewById(R.id.et_loginActivity_firstName);
        lastName = (EditText)findViewById(R.id.et_loginActivity_lastName);
        login = (Button) findViewById(R.id.btn_loginActivity_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.loginButtonClicked();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        presenter.setView(this);
        presenter.getCurrentUser();

    }

    @Override
    public String getFirstName() {
        return firstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return lastName.getText().toString();
    }

    @Override
    public void showUserNotAvailable() {
        Toast.makeText(this, "Error the user is not available", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showInputError() {
        Toast.makeText(this, "First Name or Last name cannot be empty", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showUserSavedMessage() {
        Toast.makeText(this, "User saved!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void setFirstName(String fname) {
        firstName.setText(fname);
    }

    @Override
    public void setLastName(String lname) {
        lastName.setText(lname);
    }
}

