package com.company.aviary;

import com.company.kind.Bird;

public class CoveredAviary {
    public static void list(){
        System.out.println("ОБИТАТЕЛИ ВОЛЬЕРА, ПОКРЫТОГО СЕТКОЙ (" + Bird.coveredAviary.size() + " ШТ):");
        for (Bird obj: Bird.coveredAviary) {
            System.out.println(obj.toString());
        }
    }
}
