package com.example.a11java_temelleri;

import java.util.Scanner;

public class kararyapilarisoru2 {
    // Geçme notu girilen bir öğrencinin geçme harfini ekrana yazdırınız
    //90-100 arası AA
    //80-90 arası BA
    //70-80 arası BB
    //60-70 arası CB
    //50-60 arası CC
    //50 nin altı  FF- Kaldı

    public static void main(String[] Args) {
        Scanner deger = new Scanner(System.in);
        System.out.println("Geçme notunuzu giriniz: ");
        int puan = deger.nextInt();
        if (puan >= 0 && puan <= 100) {
            if (puan >= 90) {
                System.out.println("Notunuz AA");
            } else if (puan >= 80) {
                System.out.println("Notunuz BA");
            } else if (puan >= 70) {
                System.out.println("Notunuz BB");
            } else if (puan >= 60) {
                System.out.println("Notunuz CB");
            } else if (puan >= 50) {
                System.out.println("Notunuz CC");
            } else {
                System.out.println("Notunuz FF, Kaldı");
            }
        } else
        {
            System.out.println("Yanlış bir değer girdiniz.");
        }
    }
}
