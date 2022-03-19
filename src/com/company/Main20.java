package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main20 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(23);
        numbers.add(13);
        numbers.add(7);
        numbers.add(6);
        numbers.add(100);
        numbers.add(55);

        Collections.sort(numbers, Collections.reverseOrder());
        for(int i : numbers){
            System.out.print(i + " ");
        }
        System.out.println(numbers);


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Lexus");
        cars.add("Porsche");
        cars.add("Ford");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Volvo");
        Collections.sort(cars);
        System.out.println(cars);
    }
}
