package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        System.out.print("Please write some word or sentence : ");
        Scanner scn = new Scanner(System.in);
        String someString = scn.nextLine();
        char someChar = 'e';
        int count = 0;
        int total = 0;
        int words = 0;
        String[] totalwords = someString.split(" ");
        System.out.println(Arrays.toString(totalwords));

        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == someChar) {
                count++;
            }
            if (someString.charAt(i) != ' ') {
                total++;
            }

        }
        int i = 0;
            for (String element : totalwords) {
                if (!totalwords[i].equals("")) {
                    words++;
                }
                i++;
            }

       System.out.println(count);
        System.out.println(total);
        System.out.println(words);
    }
}
