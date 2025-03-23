package com.arshad.taskmanager.sampleapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        String jsonResponse = "{ \"id\": 1, \"name\": \"John\", \"age\": 30 }";

        ObjectMapper mapper = new ObjectMapper();

        try {
            User user = mapper.readValue(jsonResponse, User.class);
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// User.java
class User {
    private int id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    // Getters and Setters
    // toString() for easy printing
    @Override
    public String toString(){
        return id + " and " + name + " and " + age;
    }
}