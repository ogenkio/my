package com.example.pojo;

import org.springframework.stereotype.Component;

@Component
public class dog {
    private String name;
    private int age;

    public dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public dog() {
    }

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

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
