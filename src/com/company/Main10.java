package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args){
        int [] array;
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        n = scn.nextInt();
        array = new int[n];
        for(int i =0; i < n; i++){
            System.out.print("Enter array[" + i + "] = ");
            array[i] = scn.nextInt();
        }
        System.out.println("Array : " + Arrays.toString(array));

//        int num1,num2;
//        num1 = 196;
//        num2 = 2;
//        int result = num1 % num2;
//        System.out.print(result);
    }
}
