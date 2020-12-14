package com.company.kind;
import com.company.Animal;
import java.util.ArrayList;

public class Hoofed extends Animal {
    public static ArrayList<Hoofed> openAviary = new ArrayList<>();

    public Hoofed(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void addInAviary() {
        openAviary.add(Hoofed.this);
    }

    @Override
    public String toString() {
        return getName() + ", год рождения - " + getAge() + ", вес - " + getWeight() + " кг.";
    }
}