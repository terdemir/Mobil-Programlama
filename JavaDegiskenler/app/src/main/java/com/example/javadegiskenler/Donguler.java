package com.example.javadegiskenler;

public class Donguler {
    public static void main (String[] args){
        //for loop(döngü)

        for (int i=0;i<10; i++){
            System.out.println("Turgay Erdemir");
        }

        int[] sayilar={10,15,20,22,35};

        for (int i=0;i<sayilar.length;i++){
            int sonuc=sayilar[i]/5;
            System.out.println(sonuc);
        }

        //while loop

        int j=0;
        while (j<10){
            System.out.println("Mobil Programlama");
            j++;
        }

    }
}
