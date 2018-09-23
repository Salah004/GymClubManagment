package com.salah.gymclubmanagment.applications;

import android.app.Application;

import io.realm.Realm;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize Realm. Should only be done once when the application starts.
        Realm.init(this);

        // In this example, no default configuration is set,
        // so by default, `RealmConfiguration.Builder().build()` is used.
    }
}
