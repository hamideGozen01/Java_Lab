/*
Write a program that generates a random number between 1 and 20. Then asks the
user to guess what the number is.
• If the user's guess is higher than the random number, the program should display
"Too high, try again."
• If the user's guess is lower than the random number, the program should display
"Too low, try again."
• The program should use a loop that repeats until the user correctly guesses the
random number.
• Use do while loop.
*/

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** GUESS MY NUMBER GAME *****");
        Scanner sc = new Scanner(System.in);


        Random r = new Random();
        int rndm = r.nextInt(20)+1;
        int number;

        int tries = 0;


        do {
            System.out.print("Enter a guess between 1 and 20: ");
            number = sc.nextInt();
            tries++;

            if (number < rndm) {
                System.out.println("Too low, try again.");
            } else if (number > rndm) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Correct! You got it in " + tries + " guesses!");
            }

        } while (rndm != number);

    }
}