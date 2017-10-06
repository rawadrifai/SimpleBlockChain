package com.unveil360.blockchain;

/**
 * Created by rawad.elrifai on 10/5/17.
 */
public class Person {

    private int id;
    private String name;

    public Person() {
        id = 0;
        name = "";
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}