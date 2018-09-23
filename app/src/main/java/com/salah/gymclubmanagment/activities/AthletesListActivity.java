package com.salah.gymclubmanagment.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.melnykov.fab.FloatingActionButton;
import com.salah.gymclubmanagment.R;

public class AthletesListActivity extends AppCompatActivity {

    private ListView lv ;
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_athletes_list);
        lv = (ListView) findViewById(R.id.lv);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.attachToListView(lv);

        com.salah.gymclubmanagment.activities.ListAthletesAdapter adapter = new com.salah.gymclubmanagment.activities.ListAthletesAdapter(this);
        lv.setAdapter(adapter);

    }

    public void addNewAthletes(View view) {
        Intent intent = new Intent(this,SignupActivity.class);
        startActivity(intent);
    }
}
