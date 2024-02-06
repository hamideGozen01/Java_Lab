/*
Write a program that calculates the cost of travelling from one city to
another. It reads the two city, distance and cost for per kilometer.
Then prints the cost of traveling as integer value.
*/


import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        System.out.print("Enter a starting city: ");
        String city1 = sc.next();

        System.out.print("Enter a ending city: ");
        String city2 = sc.next();

        System.out.print("Enter distance in kilometers between cities: ");
        double dist = sc.nextDouble();

        System.out.print("Enter the cost of travel per kilometer: ");
        double perkm = sc.nextDouble();

        double cost = perkm * dist;

        out.println("The cost of travelling from" +
                "\"" + city1 + "\"" + "to" + "\"" + city2 + "\"" + "is" + cost);

    }
}