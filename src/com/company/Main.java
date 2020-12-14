package com.company;

import com.company.aviary.Aquarium;
import com.company.aviary.CoveredAviary;
import com.company.aviary.OpenAviary;
import com.company.aviary.Terrarium;
import com.company.kind.Bird;
import com.company.kind.Hoofed;
import com.company.kind.Reptile;
import com.company.kind.Water;

public class Main {

    public static void main(String[] args) {
        Hoofed hoofed1 = new Hoofed ("Бык Боря", 2011,353);
        hoofed1.addInAviary ();
        Hoofed hoofed2 = new Hoofed ("Буйвол Силач", 2015,255);
        hoofed2.addInAviary();
        Hoofed hoofed3 = new Hoofed ("Олень Яша", 2016,157);
        hoofed3.addInAviary();
        Hoofed hoofed4 = new Hoofed ("Антилопа Шторм", 2017,91);
        hoofed4.addInAviary();
        Hoofed hoofed5 = new Hoofed ("Антилопа Гроза", 2017,68);
        hoofed5.addInAviary();
        Reptile reptile1 = new Reptile("Игуана Гордая", 2018, 2);
        reptile1.addInAviary();
        Reptile reptile2 = new Reptile("Крокодил Гена", 2010, 250);
        reptile2.addInAviary();
        Reptile reptile3 = new Reptile("Питон Гоша", 2015, 146);
        reptile3.addInAviary();
        Water water1 = new Water("Морская черепаха Нюша", 2009, 84);
        water1.addInAviary();
        Bird bird1 = new Bird("Ястреб Головач", 2017,5);
        bird1.addInAviary();
        Bird bird2 = new Bird("Гриф Стервец", 2009,15);
        bird2.addInAviary();
        Bird bird3 = new Bird("Гриф Сестрица", 2013,12);
        bird3.addInAviary();

        System.out.println();
        OpenAviary.list();System.out.println();
        Terrarium.list();System.out.println();
        Aquarium.list();System.out.println();
        CoveredAviary.list();System.out.println();
    }
}


