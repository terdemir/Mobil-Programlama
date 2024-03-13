package com.example.javadegiskenler;

public class Karar_Yapilari {
    public static void main (String[] args){

        int x=30;
        int y=30;
        int z=-20;

        if (x<y){
            System.out.println("y büyüktür");
        } else if (x>y) {
            System.out.println("x büyüktür");
        } else {
            System.out.println("x ile y eşittir");
        }

        if ((x*z)<0){
            System.out.println("sayı negatiftir");
        } else if ((x*z)>0){
            System.out.println("sayı pozitiftir");
        } else {
            System.out.println("sayı sıfırdır");
        }

        int vsinav=100;
        int fsinav=45;
        int ortalama=(vsinav*40/100)+(fsinav*60/100);
        if (ortalama>=60){
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }

        if(ortalama>=60 && fsinav>=50) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }


    }
}
