package com.company;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args){
        String[] monthsname = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        Scanner userInput = new Scanner(System.in);

        while(true) {
            System.out.println("Enter please month number (From 1 to 12): ");
            int chosenMonth = userInput.nextInt();
            if (chosenMonth > 12) {
                System.out.println("Enter the number of month from 1 to 12 next time");
            } else if (chosenMonth < 1) {
                System.out.println("Enter the number of month from 1 to 12 next time");
            } else {
                System.out.println("The month is " + monthsname[chosenMonth - 1]);
            }
        }
    }
}
