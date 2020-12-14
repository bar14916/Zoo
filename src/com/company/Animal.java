package com.company;

public abstract class Animal {
    private String name;
    private int age;
    private int weight;

    public String getName() {return name;}
    public int getAge() {return age;}
    public int getWeight() {return weight;}

    public Animal (String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public abstract void addInAviary();
}