package com.company.aviary;
import com.company.kind.Reptile;

public class Terrarium {
    public static void list (){
        System.out.println("ОБИТАТЕЛИ ТЕРРАРИУМА (" + Reptile.terrarium.size() + " ШТ):");
        for (Reptile obj: Reptile.terrarium) {
            System.out.println(obj.toString());
        }
    }
}
