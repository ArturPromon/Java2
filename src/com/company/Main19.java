package com.company;

import java.util.ArrayList;

public class Main19 {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("Bmw");
        cars.add("Lexus");
//        System.out.println(cars);
        System.out.println(cars.get(1));
        cars.set(1, "Volvo");
        System.out.println(cars.size());
        cars.remove(2);
        System.out.println(cars);
        cars.clear();
        System.out.println("cars " + cars);
    }
}
