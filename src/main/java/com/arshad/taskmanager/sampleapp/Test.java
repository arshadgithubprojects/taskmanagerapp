package com.arshad.taskmanager.sampleapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        String jsonResponse = "{ \"id\": 1, \"name\": \"John\", \"age\": 30 }";
        System.out.println(jsonResponse);
        ObjectMapper mapper = new ObjectMapper();

        try {
            User user = mapper.readValue(jsonResponse, User.class);
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}

// User.java
@Setter
@Getter
@ToString
class User {
    private int id;
    private String name;
    private int age;
}