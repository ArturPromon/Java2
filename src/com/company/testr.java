package com.company;

public class testr implements test1i {
    String country;

    testr(String country){
        this.country = country;
    }

    @Override
    public void printCountry(){
        System.out.println("Country is " + country);
    }
}
