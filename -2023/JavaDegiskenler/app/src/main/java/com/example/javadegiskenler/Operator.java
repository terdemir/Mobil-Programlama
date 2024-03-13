package com.example.javadegiskenler;

public class Operator {

    public static void main (String[] args){
        //matematiksel op (+-/*=...)
        int x=5;
        x=x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--; //x=x-1
        System.out.println(x);
        x=x*2;
        System.out.println(x);
        x*=2;
        System.out.println(x);
        x+=1;
        System.out.println(x);

        //karşılaştırma op (<> == !=...)
        int y=10;
        System.out.println(y<x);
        System.out.println(y>x);
        System.out.println(y<=x);
        System.out.println(y==x); //eşit ise
        System.out.println(y!=x); //eşit değilse


        //mantıksal op (and, or, not)
        System.out.println(y<x && y>x); //and-ve &&
        System.out.println(y<x || y>x); //or-veya ||

    }
}
