package com.salah.gymclubmanagment.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.salah.gymclubmanagment.R;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLogin(View view) {
        Intent intent = new Intent(LoginActivity.this,AthletesListActivity.class);
        startActivity(intent);
    }
}
