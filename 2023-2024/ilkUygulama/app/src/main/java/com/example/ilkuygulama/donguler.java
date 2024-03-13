package com.example.ilkuygulama;

public class donguler {
    public static void main(String[] Args){

        for(int i=0; i<10;i++){
            System.out.println("Merhaba Java");
        }

        int[] sayilar={10,20,30,40,50,60};
        System.out.println(sayilar[2]);

        //for döngüsü
        for(int i=0; i<sayilar.length;i++){
            double bolum=sayilar[i]/5;
            System.out.println(bolum);
        }

        //while döngüsü
        int sayac=0;
        while (sayac<sayilar.length){
            double bolum=sayilar[sayac]/5;
            System.out.println(bolum);
            sayac++; //sayac=sayac+1 ya da sayac++
        }



    }
}
