package com.example.ilkuygulama;

public class kararyapilari {

    public static void main(String[] Args){
        int sicaklik=105;
        if(sicaklik>=100){
            System.out.println("gaz hali");
        }
        else if (sicaklik>=0) {
            System.out.println("sıvı hali");
        }
        else{
            System.out.println("katı hali");
        }

        if(sicaklik>=100){
            System.out.println("gaz hali");
        }
        if (sicaklik>=0 && sicaklik<100) {
            System.out.println("sıvı hali");
        }
        if (sicaklik<0){
            System.out.println("katı hali");
        }

        String cinsiyet="Kadın";
        if(cinsiyet=="Kadin"){
            System.out.println("Askerlik yapmayacak");
        }
        else{
            System.out.println("Askerlik yapacak");
        }

    }
}
