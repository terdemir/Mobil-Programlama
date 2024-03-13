package com.example.ilkuygulama;

public class diziler {
    public static void main(String[] Args){

        String[] isimler=new String[3];
        isimler[0]="Turgay";
        isimler[1]="Ahmet";
        isimler[2]="Yiğit";
        System.out.println(isimler[2]);

        int[] yas=new int[5];
        yas[0]=34;
        yas[1]=20;
        yas[2]=56;

        System.out.println(yas[1]);

        int[] rakamlar={1,2,3,4,5,6,7,8,9};

        System.out.println(rakamlar[4]);

        for (int i=0;i<rakamlar.length;i++){
            System.out.println(yas[i]);
        }

        System.out.println(rakamlar[rakamlar.length-1]);




    }

}
