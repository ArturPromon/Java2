package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        String[] monthsname = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        System.out.println("Please enter name of months January-December: ");
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();

        if(Arrays.asList(monthsname).contains(line)){
            System.out.print(Arrays.asList(monthsname).indexOf(line) + 1);
        }else{
            System.out.println("Error!");
        }
    }
}
