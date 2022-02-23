package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int first;
        System.out.println("Enter first number: ");
        first = scn.nextInt();

        if(first ==5){
            System.out.println("number is 5");
        }else{
            System.out.println("number is not 5");
        }

        switch(first){
            case 5:
                System.out.println("number is 5");
                break;
            case 6:
                System.out.println("number is 6");
                break;
            default:
                System.out.println("Number is " + first);
        }
    }
}
