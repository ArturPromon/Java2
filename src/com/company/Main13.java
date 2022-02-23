package com.company;

public class Main13 {
    public static void main(String[] args){
//        boolean play = true;
//        int i = 0;
//        while(play){
//            i++;
//            System.out.println(i);
//            play = false;
//        }

//        int num = 0;
//        while(num<100){
//            num+=5;
//            System.out.print(" " + num);
//        }
        int num = 25;
        int result = 1;
        int range = 1;

        while(true){
            result = result * num;
            System.out.println(num + " в степени " + range + " = " + result);
            range++;
            if(range>10){
                break;
            }
        }
    }
}
