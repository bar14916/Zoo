package com.company.kind;

import com.company.Animal;

import java.util.ArrayList;

public class Bird extends Animal {
    public static ArrayList<Bird> coveredAviary = new ArrayList<>();
    public Bird (String name, int age, int weight){
        super(name, age, weight);
    }

    @Override
    public void addInAviary() {
        coveredAviary.add(Bird.this);
    }

    @Override
    public String toString() {
        return getName() + ", год рождения - " + getAge() + ", вес - " + getWeight() + " кг.";
    }
}
