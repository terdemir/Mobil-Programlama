package com.example.javadegiskenler;

import java.util.ArrayList;

public class Diziler {

    public static void main (String[] args) {

    //array

        String[] metindizisi=new String[2];
        metindizisi[0]="Turgay";
        metindizisi[1]="Erdemir";


        System.out.println(metindizisi[0]);
        System.out.println(metindizisi[1]);

        String[] isimler={"Mehmet", "Ozan", "Ali"};
        System.out.println(isimler[1]);

        int[] sayilar=new int[4];
        sayilar[0]=10;
        sayilar[1]=20;

        System.out.println(sayilar[1]);

        int[] sayilar2={1,2,3,40};
        System.out.println(sayilar2[3]);


        //listeler
        ArrayList<String> donanim=new ArrayList<>();
        donanim.add("Klavye");
        donanim.add("Monitör");
        donanim.add(1,"Fare");

        System.out.println(donanim.get(1));
        System.out.println(donanim.get(2));





    }
}
