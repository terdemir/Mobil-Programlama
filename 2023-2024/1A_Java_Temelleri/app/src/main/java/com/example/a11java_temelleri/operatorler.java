package com.example.a11java_temelleri;

public class operatorler {
    public static void main(String[] args){
        //karşılaştırma operatörleri
        int x=6;
        int y=4;
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x<=y);
        System.out.println(x!=y);
        System.out.println(x==y);

        //mantıksal operatörler
        x=3;
        int z=5;
        System.out.println(x<y && x<z); //ve
        System.out.println(z<y || z>x); //veya

        //matematiksel operatörler,
        int sonuc=x+y;
        System.out.println(sonuc);
        sonuc=x-y;
        System.out.println(sonuc);
        sonuc=x/y;
        System.out.println(sonuc);
        sonuc=x*y;
        System.out.println(sonuc);

    }
}
