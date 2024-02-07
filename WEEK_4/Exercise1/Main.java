/*
Write a Java program that provides temperature-related advice to the user. The program will
take the temperature in Celsius as input, offer clothing advice for different temperature ranges:
1. If the input temperature is within a reasonable range (e.g., between -20°C and 40°C) and
display an error message if the input is invalid.
2. If the temperature is less than 5 degrees Celsius, advise the user to wear a heavy coat and
gloves.
3. If the temperature is between 5 and 15 degrees Celsius (inclusive), advise the user to wear
a jacket and a hat.
4. For temperatures between 16 and 25 degrees Celsius (inclusive), recommend wearing a
light jacket.
5. For temperatures above 26 degrees Celsius, advise the user to wear t-shirt and sunglasses.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double temp = sc.nextDouble();

        if (!(-20 <= temp) || !(temp <= 40)) {
            System.out.println("Invalid temperature! Please enter temperature within the range of -20°C to 40°C");
        } else if (temp < 5) {
            System.out.println("Wear a heavy coat and gloves.");
        } else if (5 < temp && temp < 15) {
            System.out.println("Wear a jacket and a hat.");
        } else if (16 <= temp && temp <= 25) {
            System.out.println("Wear light jacket.");
        } else if (temp > 26) {
            System.out.println("Wear t-shirt and sunglasses.");
        }
    }
}