package com.salah.gymclubmanagment.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.salah.gymclubmanagment.R;


public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void onSubscrib(View view) {
        Intent intent = new Intent(this,SubscriberActivity.class);
        startActivity(intent);
    }
}
