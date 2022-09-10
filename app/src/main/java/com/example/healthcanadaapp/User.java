package com.example.healthcanadaapp;

public class User {
    String name;
    int age;
    String bloodtype;
    boolean isAssesible;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public boolean isAssesible() {
        return isAssesible;
    }

    public void setAssesible(boolean assesible) {
        isAssesible = assesible;
    }
}
