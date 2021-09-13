/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args){

        int orderAmount;
        double tax, total;
        String state;
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is the order amount?");
        orderAmount = scnr.nextInt();

        System.out.println("Which state do you live in?");
        state = scnr.next();

        if(state.equalsIgnoreCase("Wisconsin"))
        {
            tax = 0.05;
            String county;

            System.out.println("What county do you live in?");
            county = scnr.next();

            if(county.equalsIgnoreCase("Eau Claire")){
                tax = tax + 0.005;

            }
            if(county.equalsIgnoreCase("Dunn")){
                tax = tax + 0.004;
            }

            tax = tax * orderAmount;

            System.out.printf("The tax is $%.2f \n", tax);
        }
        else if(state.equalsIgnoreCase("Illinois")){
            tax = 0.08;
            tax = tax * orderAmount;
            System.out.printf("The tax is $%.2f \n", tax);
        }
        else{
            tax = 0;
        }

        total = orderAmount + tax;

        System.out.printf("The total is $%.2f \n", total);

        System.exit(0);
    }//end of main

}//end of program