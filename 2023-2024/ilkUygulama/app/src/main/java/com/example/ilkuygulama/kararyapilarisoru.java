package com.example.ilkuygulama;

public class kararyapilarisoru {
    //vizeden 80 finalden 60 alan bir öğrencinin ortalamasını bularak
    //dersi geçip geçmeme durumunu ekrana yazdıran programı yazınız.
    public static void main(String[] Args){
        int vizepuani=80;
        int finalpuani=50;
        if(finalpuani>=50){
            double ortalama=(vizepuani*40/100)+(finalpuani*60/100);
        if(ortalama>=60){
            System.out.println("Ortalamanız= "+ ortalama+", Dersi geçtiniz");
        }
        else{
            System.out.println("Ortalamanız= "+ ortalama+ ", Dersten kaldınız");
        }
        }
        else {
            System.out.println("Final 50 den küçük olduğu için dersten kaldınız.");
        }
    }
}
