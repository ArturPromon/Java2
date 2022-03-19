package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Reader {
    public static void main(String[] args){
        BufferedReader file = null;
        try{
            file = new BufferedReader(new FileReader("src/com/writer.txt"));
            String line;
            while((line = file.readLine()) != null){

                // toLowerCase()
                System.out.println(line.toUpperCase());
            }
            file.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
