package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main15 {
    public static void main(String[] args){
        int[] array = {50,60,50,70,90,10};
//        int sum = 0;
//        for(int i = 0; i < array.length;i++){
//            sum = sum + array[i];
//        }
//        System.out.println(sum);


//        int sum = 0;
//        int i = 0;
//        boolean isTrue = true;
//        while(isTrue){
//            sum += array[i];
//            i++;
//            if(i >= array.length){
//                isTrue = false;
//            }
//        }
//

//        int sum = 0;
//        int i = 0;
//        while(i< array.length){
//            sum+= array[i];
//            i++;
//        }
//

//        int sum = 0;
//        for(int element : array){
////            System.out.println(element);
//           sum+= element;
//        }
//

//        int sum;
//        IntStream elements = IntStream.of(array);
//        sum = elements.sum();
//        System.out.println(sum);

        System.out.println(Arrays.stream(array).sum());


    }
}
