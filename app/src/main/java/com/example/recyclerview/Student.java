package com.example.recyclerview;

public class Student {

    private String name;
    private String LastName;
    private int image;

    public Student(String name, String lastName, int image) {
        this.name = name;
        LastName = lastName;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public int getImage() {
        return image;
    }
}
