package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args){
        int [] array;
        int n;
        int count = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        n = scn.nextInt();
        array = new int[n];
        for(int i =0; i < n; i++){
            System.out.print("Enter array[" + i + "] = ");
            array[i] = scn.nextInt();
            if(array[i] > 50){
                count++;
            }

        }
        System.out.println("Array : " + Arrays.toString(array));
        int [] array2 = new int[count];
        int index = 0;
        for(int i =0;i<n; i++){
            if(array[i] > 50){
                    array2[index] = array[i];
                index++;
            }
        }
        System.out.print("All values>50 : "+Arrays.toString(array2));



//            if(array[0] > 50){
//                System.out.println(array[0]);
//            }
//            if(array[1] > 50){
//                System.out.println(array[1]);
//            }
//            if(array[2] > 50){
//                System.out.println(array[0]);
//            }
//            if(array[3] > 50){
//                System.out.println(array[1]);
//            }




    }
}
