package com.company;


import java.util.Arrays;

public class Main8 {
    public static void main(String[] args){
        int [] array = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(array[4]);

        int [] array2 = new int[] {45,0,123,55,55,99};
        System.out.println(array2[3]);

        int [] array3 = new int[] {45,0,123,55,55,99};
        System.out.println(Arrays.toString(array3));

        int [][] array4 = new int[][] {{1,3,4}, {5,6,7,6,5,6}, {10,234,43,45,2,9,76}};
        System.out.println(array4[2][3]);

        int n = 5;
        int [] array5 = new int[n];
        array5[3] = 10;
        array5[3] = 115;
        array5[1] = 5;
        System.out.print("Array5"+Arrays.toString(array5));

    }
}
