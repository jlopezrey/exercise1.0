package com.company;



public class Main {
    

    public static void main(String[] args) {

        String city = "Columbus";
        int zip = 43215;
        int[] dailyHigh = {32,25,27,40,45};
        int highTemp = (dailyHigh[0]+dailyHigh[1]+dailyHigh[2]+dailyHigh[3]+dailyHigh[4])/5;


        System.out.println("City: "+city+" Zip Code: "+zip+" Average High Temperature: "+highTemp);

    }
}
