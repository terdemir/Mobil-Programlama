package com.example.ilkuygulama;

public class operatorler {
    public static void main(String[] args){
        //matematiksel operatörler
        int x=5;
        int y=10;
        int z;

        z=x+y;
        System.out.println("Toplam="+z);
        z=x-y;
        System.out.println("Fark="+z);
        z=x*y;
        System.out.println("Çarpım="+z);
        z=y/x;
        System.out.println("Bölüm="+z);

        //karşılaştırma operatörleri
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x<=y);
        System.out.println(x>=y);
        System.out.println(x==y);
        System.out.println(x!=y);

        //mantıksal operatörler
        System.out.println(x<y && x>y); //ve
        System.out.println(x<y || x>y); //veya


    }
}
