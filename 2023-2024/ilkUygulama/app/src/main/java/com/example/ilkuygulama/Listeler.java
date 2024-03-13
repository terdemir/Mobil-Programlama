package com.example.ilkuygulama;

import java.util.ArrayList;

public class Listeler {
    public static void main(String[] Args){
        ArrayList<String> sehirler=new ArrayList<>();
        sehirler.add("Amasya");
        sehirler.add("Samsun");
        sehirler.add(1,"Çorum");
        sehirler.add("Tokat");
        System.out.println(sehirler.get(0));
        System.out.println(sehirler.get(1));
        System.out.println(sehirler.get(2));
        System.out.println(sehirler.get(3));
        sehirler.clear();
        System.out.println(sehirler.get(0));
        sehirler.remove(2);
        System.out.println(sehirler.get(2));
    }
}
