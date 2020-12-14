package com.company.kind;

import com.company.Animal;

import java.util.ArrayList;

public class Reptile extends Animal {
    public static ArrayList<Reptile> terrarium = new ArrayList <>();
    public Reptile(String name, int age, int weight) {
        super(name, age, weight);
    }
    @Override
    public void addInAviary() {
        terrarium.add(Reptile.this);
    }

    @Override
    public String toString() {
        return getName() + ", год рождения - " + getAge() + ", вес - " + getWeight() + " кг.";
    }
}
