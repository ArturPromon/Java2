package com.company;
import java.lang.Math;

public class Mathematics {
    public static void main(String[] args){
//     Math.random  [0,100)
//        Math.round()
        int num;
        num = (int)Math.round(Math.random()*101);
        System.out.println("Math.random " + num);
        float num2 = 5.4f;
        System.out.println("Math.round " + Math.round(num2));
        float num3 = 5.999999f;
        System.out.println("Math.floor " + Math.floor(num3));
        float num4 = 5.1f;
        System.out.println("Math.ceil " + Math.ceil(num4));
        int num5, num6;
        num5 = 200;
        num6 = 150;
        System.out.println("maximum " + Math.max(num5, num6));
        System.out.println("minimum " + Math.min(num5, num6));
        int num7;
        num7 = 10;
        System.out.println("sqrt " + Math.sqrt(num7));


    }
}
