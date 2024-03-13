package com.example.ilkuygulama;

public class methotlar {

       //geri değer döndürmeyen parametresiz methot
    public static void toplama(){
        int x=4;
        int y=5;
        int sonuc=x+y;
        System.out.println(sonuc);
    }

    //geri değer döndürmeyen parametreli methot
    public static void toplama2(int x, int y){
        int sonuc=x+y;
        System.out.println(sonuc);
    }

    //geri deger döndüren parametresiz methot
    public static int carpma(){
        int x=4;
        int y=5;
        int sonuc=x*y;
        return sonuc;
    }

    //geri değer döndüren parametreli methot
    public static int carpma(int x, int y){
        int sonuc=x*y;
        return sonuc;
    }

    public static void main(String[] Args){
        toplama();
        toplama2(34,56);
        int carpim=carpma(4,10);
        System.out.println(carpim);

    }

}
