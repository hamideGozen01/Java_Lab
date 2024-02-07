/*
Write a program that reads a set of integers, and then prints the sum of the even and
odd integers.
• Use do-while loop for this process.
• Also, ask the user if he/she will continue to enter the number (y/n), if the answer is
n, end the program and display the sum of even and odd number.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evensum = 0, oddsum = 0;
        int number;
        char decision;

        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            System.out.print("Do you want to continue y/n? ");
            decision = sc.next().charAt(0);

            if (number % 2 == 0) {
                evensum = evensum + number;
            } else {
                oddsum = oddsum + number;
            }
        } while (decision == 'y');

        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Sum of odd numbers: " + oddsum);
    }
}