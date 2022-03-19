package com.company;

public class trycatch {
    public static void main(String[] args){
        int arr[] = {5,6,7};
//        int x = 100/0;
        int [] array = new int[10];
        try{
            array[9] = 5;
            System.out.println(arr[1]);
            int x = 100 / 0;
        }catch (Exception e){
            System.out.println("Some error" + e);
        }finally {
            System.out.println("Hello world");
        }
    }
}
