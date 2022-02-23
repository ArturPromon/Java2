package com.company;

public class Main12 {
    public static void main(String[] args){
        // 2 4 8 16 32
        int num =1;
        for(int i = 0; i<20;i++){
            num = num*2;

           if(num != 128) {
               System.out.print(" " + num);
           }
        }

        for(int i = 2; i<1025;i*=2){
            System.out.print(" " + i);
        }
    }
}
