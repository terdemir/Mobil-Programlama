package com.example.a11java_temelleri;

public class kararyapilari {
    public static void main(String[] Args){
        int x=5;
        int y=10;

        if(x<y){
            System.out.println("x<y'dir");
        }
        else if (x>y) {
            System.out.println("x>y'dir");
        }
        else{
            System.out.println("x=y'dir");
        }


        if(x<y){
            System.out.println("x<y'dir");
        }
        if(x>y){
            System.out.println("x>y'dir");
        }
        if(x==y){
            System.out.println("x=y'dir");
        }
        if(x!=y){
            System.out.println("x y den farklıdır");
        }

        String cinsiyet="Kadın";
        if(cinsiyet=="Kadın"){
            System.out.println("Askere gitmeyecek");
        }
        else{
            System.out.println("Askere gidecek");
        }


    }
}
