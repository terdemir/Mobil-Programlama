package com.example.a11java_temelleri;

public class methodlar {
    public static void main(String[] Args){

        int sonuc=toplama();
        System.out.println(sonuc);

        int sonuc2=toplama2(20,40);
        System.out.println(sonuc2);


    }
    public void carpma(){ //geri değer döndürmeyen method
        int x=4*4;
        System.out.println("x'in değeri="+x);
    }

    public void carpma2(int x,int y){ //paremetreli geri değer döndürmeyen
        int sonuc=x*y;
        System.out.println(sonuc);
    }
    public static int toplama(){ //geri değer döndüren
        int x=5+10;
        return x;
    }

    public static int toplama2(int x, int y){ //parametreli geri değer döndüren
        int sonuc=x+y;
        return sonuc;
    }

}
