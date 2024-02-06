/*
Write a Java program that generates a password for the user based on their input.
Follow these steps:
1. Prompt the user to enter the first name, last name and favorite color.
2. Extract the first two characters from the first name
3. Extract the last one character from the last name. Convert it to uppercase.
4. Change the second character in the favorite color with 'X'.
5. Finally, concatenate them for the password and display the user.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first_name = sc.next();

        System.out.print("Enter your last name: ");
        String last_name = sc.next();

        System.out.print("Enter your favorite color: ");
        String color = sc.next();

        String firsPart = first_name.substring(0, 2);
        String secondPart = last_name.substring(last_name.length() - 1).toUpperCase();
        String colorPart = color.replace(color.charAt(1), 'X');

        String password = firsPart + secondPart + colorPart;
        System.out.println("Your generated password is: " + password);

    }

}