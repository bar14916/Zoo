package com.company.kind;
import com.company.Animal;
import java.util.ArrayList;

public class Water extends Animal {
    public static ArrayList<Water> aquarium = new ArrayList<>();
    public Water (String name, int age, int weight){
        super(name, age, weight);
    }

    @Override
    public void addInAviary() {
        aquarium.add(Water.this);
    }

    @Override
    public String toString() {
        return getName() + ", год рождения - " + getAge() + ", вес - " + getWeight() + " кг.";
    }
}
