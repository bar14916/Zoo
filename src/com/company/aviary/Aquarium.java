package com.company.aviary;
import com.company.kind.Water;

public class Aquarium {
    public static void list(){
        System.out.println("ОБИТАТЕЛИ АКВАРИУМА (" + Water.aquarium.size() + " ШТ):");;
        for (Water obj: Water.aquarium) {
            System.out.println(obj.toString());
        }
    }
}
