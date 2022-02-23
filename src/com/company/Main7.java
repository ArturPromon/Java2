package com.company;

public class Main7 {

    public static void main(String[] args){
//        for(int i = 1; i<11; i++){
//            System.out.println("");
//            for(int j = 1; j<4; j++){
//                System.out.print("*");
//            }
//        }
//        int a = 10;
//        int b = 10;
//
//        // [1 , 10]   [1, 10)
//        for(int i = 1; i<=a; i++){
//            System.out.print("\n");
//            for(int j = 1; j<=b; j++){
//                System.out.print(i*j + "\t");
//            }
//        }
        System.out.println("Even numbers: ");
        for(int i = 100; i>=2; i-=2){
            if(i>2){
                System.out.print(i + " ");
            }else{
                System.out.println(i);
            }

        }
        System.out.println("Odd numbers: ");
        for(int i = 1; i<100; i+=2){
            System.out.print(i + " ");
        }
    }
}
