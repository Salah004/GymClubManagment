package com.salah.gymclubmanagment.classes;

import io.realm.RealmModel;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.RealmClass;

// It is possible to use @RealmClass and implement RealmModel, instead of extending RealmObject.
@RealmClass
public class Dog implements RealmModel {
    // It is possible to also use public fields, instead of getters/setters.
    public String name;

    // You can define inverse relationships.
    @LinkingObjects("dog")
    public final RealmResults<Person> owners = null;
}
