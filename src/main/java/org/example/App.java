/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double euros = input.nextDouble();

        System.out.print("What is the exchange rate? ");
        double exchange_rate = input.nextDouble();

        System.out.printf("%.2f euros at an exchange rate of %.4f is%n%.2f U.S. dollars.", euros, exchange_rate, euros * exchange_rate);
    }
}