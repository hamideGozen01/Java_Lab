/*
Write a Java program to solve quadratic equations shown in the formula:
        𝑎𝑥^2 + 𝑏𝑥 + 𝑐 = 0
        Generate the values of the coefficients a, b, and c as randomly by following rules:
        1. generates a random integer number between 1 and 10 for coefficient a.
        2. generates a random integer number between 5 and 25 for coefficient b.
        3. generates a random integer number between 0 and 30 for coefficient c.
        How to calculate the roots of a quadratic equation:
        𝑟𝑜𝑜𝑡𝑠 =−𝑏 ± \/∆ /2𝑎 𝑤ℎ𝑒𝑟𝑒 ∆= 𝑏^2 − 4𝑎𝑐
        NOTE: Use Math library for the formula and display roots as formatted (0.xx)
*/

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decFormat = new DecimalFormat("0.##");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter a: ");
        int b = sc.nextInt();

        System.out.print("Enter a: ");
        int c = sc.nextInt();

        decFormat = new DecimalFormat("0.##");
        double delta = Math.pow(b, 2) - (4 * a * c);

        System.out.println("for a = " + a + " b = " + b + " c = " + c);
        double root1 = (-b + Math.sqrt(Math.abs(delta))) / (2 * a);
        double root2 = (-b - Math.sqrt(Math.abs(delta))) / (2 * a);

        System.out.println("First root: " + decFormat.format(root1));
        System.out.println("Second root: " + decFormat.format(root2));
    }
}