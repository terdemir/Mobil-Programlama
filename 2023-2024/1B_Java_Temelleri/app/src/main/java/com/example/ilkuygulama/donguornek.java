package com.example.ilkuygulama;

import java.util.Scanner;

public class donguornek {
    public static void main(String[] Args){
        //Öğrenci sayısını kullanıcıdan alarak,
        // tek tek geçme notu girilen bir sınıftaki öğrencilerin ortalama geçme puanını bulunuz.

        Scanner deger=new Scanner(System.in);
        int ksayisi, puan;
        int toplam=0;

        System.out.println("Öğrenci sayısını giriniz");
        ksayisi=deger.nextInt();

        for (int i=1;i<=ksayisi;i++){
            System.out.println(i+". öğrenci notunu giriniz: ");
            puan=deger.nextInt();
            toplam=toplam+puan;
     }
        double ortalama=toplam/ksayisi;
        System.out.println("Sınıf Ortalaması= "+ ortalama);
    }
}
