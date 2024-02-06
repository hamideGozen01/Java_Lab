/*Write a program that reads the radius of a circle as a floating point
value (float), then prints the area and perimeter of the circle. (pi
is the constant and take 3.14)*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float pi = 3.14f;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = sc.nextFloat();

        float area = pi * r * r;
        float perimeter = 2 * pi * r;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}