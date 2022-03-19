package com.company;

public class Main18 {
    public static void main(String[] args){
        int num =5;
        boolean isTrue = true;
        do{
            num++;
            System.out.println(num);
            if(num>=10){
               isTrue = false;
            }
        }while(isTrue);


        int num2 = 5;
        do{
            num++;
            System.out.println(num2);
        }while(num2>10);
    }
}
