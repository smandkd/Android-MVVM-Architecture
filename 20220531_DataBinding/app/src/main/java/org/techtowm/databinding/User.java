package org.techtowm.databinding;

import androidx.databinding.ObservableField;

import java.util.Observable;

public class User {
    private final String contact;
    public final ObservableField<String> firstName = new ObservableField<String>();
    public User(  String contact ) {
        this.contact = contact;
    }

    public String getContact() {
        return this.contact;
    }

}
