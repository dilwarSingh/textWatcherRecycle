package com.example.dilwar.textwatcherrecycle;

/**
 * Created by dilwar on 09-05-2018.
 */

public class Names {

    String name;
    Boolean check;

    public Names(String name, Boolean check) {
        this.name = name;
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }
}
