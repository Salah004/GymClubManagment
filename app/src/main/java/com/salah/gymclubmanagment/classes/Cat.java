package com.salah.gymclubmanagment.classes;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;

public class Cat extends RealmObject {
    // It is possible to also use public fields, instead of getters/setters.
    public String name;

    // You can define inverse relationships.
    @LinkingObjects("cats")
    public final RealmResults<Person> owners = null;
}
