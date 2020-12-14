package com.company.aviary;

import com.company.kind.Hoofed;

public class OpenAviary{
    public static  void list() {
        System.out.println("ОБИТАТЕЛИ ОТКРЫТОГО ВОЛЬЕРА (" + Hoofed.openAviary.size() + " ШТ):");
        for (Hoofed obj : Hoofed.openAviary) {
            System.out.println(obj.toString());
        }
    }
}

