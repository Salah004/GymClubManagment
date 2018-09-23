package com.salah.gymclubmanagment.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.salah.gymclubmanagment.R;


public class SubscriberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscriber);
    }

    public void onBackToAthletesList(View view) {
        Intent intent = new Intent(this,AthletesListActivity.class);
        startActivity(intent);
    }
}
