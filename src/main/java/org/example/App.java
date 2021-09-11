package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "How many euros are you exchanging? " );
        int euros = sc.nextInt();

        System.out.print("What is the exchange rate? ");
        float rate = sc.nextFloat();

        float usd = euros * rate;

        System.out.printf("%d euros at an exchange rate of %.4f is%n%.2f U.S dollars.%n", euros, rate, usd);

    }
}
