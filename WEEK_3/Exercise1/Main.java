/*Write a Java program that prompts the user to enter the year,
month and day. And then display the date as the following sample
output. The month name must be the first three letters of it with
the first letter in uppercase, second and third letters in lowercase.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        System.out.print("Enter a month: ");
        String month = sc.next();

        System.out.print("Enter a day: ");
        int day = sc.nextInt();

        System.out.println("Date:" + day + " " + month.substring(0, 1).toUpperCase() + month.substring(1, 3).toLowerCase() + " " + year);


    }
}