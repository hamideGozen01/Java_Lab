/*
Write a Java program that calculates the average age of a group of student.
• Ask the user to input the number of students.
• Use a for loop to prompt the user to enter the age of each student.
• Calculate the sum of ages , and display the average age to the user.
• Ensure that the entered age is valid, between 0 and 100, and if the age is not within
the valid range, display the error message.
• Display the average as formatted (0.xxx)
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students?: ");
        int student_number = sc.nextInt();

        int student_age_sum = 0;

        for (int i = 1; i <= student_number; i++) {
            System.out.print("Enter the age of student  " + i + ": ");
            int student_age = sc.nextInt();

            if (student_age < 0 || student_age > 100) {
                System.out.println("Invalid age!");
            } else {
                student_age_sum = student_age + student_age_sum;

            }
        }

        double average = (double) student_age_sum / student_number;

        System.out.println("The average age of students is: " + decimalFormat.format(average));
    }
}
