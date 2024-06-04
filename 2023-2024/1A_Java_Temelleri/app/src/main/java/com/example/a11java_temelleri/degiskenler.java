package com.example.a11java_temelleri;

public class degiskenler {
    public static void main(String[] args){

    //tam sayılar için
    int yas=34;
    System.out.println(yas);
    System.out.println(yas*5);
    yas=60;
    System.out.println(yas);
    yas=2024-1990;
    System.out.println(yas);
    //ondalıklı sayılar
    double x=5.0;
    double y=2.2;
    System.out.println(x/y);
    double pi=3.14;
    int r=6;
    double cevre=2*pi*r;
    System.out.println(2*pi*r);
    System.out.println(cevre);
    //metinler için
        String isim="Turgay";
        String soyisim="Erdemir";
        System.out.println(isim);
        String tamisim=isim+" "+soyisim;
        System.out.println(isim+" "+ soyisim);
        System.out.println(tamisim);
        //dogru-yanlıs için
        boolean canli=true;
        canli=false;
        System.out.println(canli);

        //Sabitler
        final double pii=3.14;
       final String uni="Amasya Üniversitesi";
        System.out.println(uni);

        







    }
}
