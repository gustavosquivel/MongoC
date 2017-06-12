package com.example.esquivel.mongoc;

/**
 * Created by Esquivel on 9/06/2017.
 */

class User {

    private Id _id;
    private String user;

    public Id get_id() {
        return _id;
    }

    public void set_id(Id _id) {
        this._id = _id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


}
