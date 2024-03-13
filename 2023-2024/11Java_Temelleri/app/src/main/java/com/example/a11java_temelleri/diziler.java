package com.example.a11java_temelleri;

public class diziler {
    public static void main(String[] args){
        String[] sehirler=new String[3];
        sehirler[0]="Amasya";
        sehirler[1]="Samsun";
        sehirler[2]="Çorum";
        System.out.println(sehirler[0]);

        for(int i=1;i<=sehirler.length;i++){
            System.out.println(sehirler[i]);
        }

        int[] rakamlar={1,2,3,4,5,6,7,8,9,0};
        System.out.println(rakamlar[(rakamlar.length-1)]);



    }
}
