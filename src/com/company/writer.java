package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class writer {
    public static void main(String[] args){
        try{
            File file = new File("src/com/writer.txt");
            PrintWriter pw = new PrintWriter(file);
            if(!file.exists()){
                file.createNewFile();
                pw.println("Hello world!");
                pw.println("Artur");
                pw.close();
            }
        }catch (IOException e){
            System.out.println("Error" + e);
        }
    }
}
