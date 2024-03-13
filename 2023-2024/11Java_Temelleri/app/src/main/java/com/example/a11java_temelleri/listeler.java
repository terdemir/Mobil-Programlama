package com.example.a11java_temelleri;

import java.util.ArrayList;

public class listeler {
    public static void  main(String[] Args){
        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("Turgay");
        isimler.add(1,"Mehmet");
        isimler.add("Ahmet");
        isimler.add(1,"Ayşe");

        System.out.println(isimler.get(0));
        System.out.println(isimler.get(1));
        System.out.println(isimler.get(2));




    }


}
