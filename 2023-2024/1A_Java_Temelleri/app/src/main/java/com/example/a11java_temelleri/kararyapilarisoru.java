package com.example.a11java_temelleri;

public class kararyapilarisoru {
    //Vize puanı 80, final puanı 60 olan bir öğrencinin ortalamasını bularak
    // geçip geçmeme durumunu ekrana yazdırınız.
    public static void main(String[] args) {
        // Öğrencinin vize ve final puanları
        int vizePuanı = 80;
        int finalPuanı = 60;



        // Ortalama 60'den büyükse öğrenci dersi geçmiştir, aksi takdirde geçmemiştir
        if(finalPuanı>=50){
            // Ortalama hesaplama
            double ortalama = (vizePuanı * 0.4) + (finalPuanı * 0.6);
            System.out.println("Öğrencinin Ortalaması: " + ortalama);
        if (ortalama >= 60) {
            System.out.println("Öğrenci dersi geçti!");
        } else {
            System.out.println("Öğrenci dersi geçemedi.");
        }
        }
        else {
            System.out.println("Öğrenci dersi geçemedi, final şartı sağlanmıyor");
        }

    }
}

