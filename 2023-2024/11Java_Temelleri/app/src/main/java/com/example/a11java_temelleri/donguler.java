package com.example.a11java_temelleri;

public class donguler {
    public static void main(String[] Args){
        for(int x=0; x<10;x++){
            System.out.println("Java Dersleri");
        }

        int[] sayilar={10,20,30,40,50,60,70};
        int x=sayilar[0]/10*5;
        System.out.println(x);
        for(int i=0;i<sayilar.length;i++){
            int y=sayilar[i]/10*5;
            System.out.println(y);
        }

        int j=0;
        while (j<10){
            j++;
            System.out.println("While Döngüsü Örneği");

        }

        int faktoriyel=1;
        int z=5;
        for(z=1;z<=5;z++){
            faktoriyel=faktoriyel*z;
            System.out.println(faktoriyel);
        }

    }
}
