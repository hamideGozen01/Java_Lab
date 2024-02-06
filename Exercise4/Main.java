/*Write a Java program that prompts the students for his/her first name
and last name, then display the student's KGTU e-mail account as the
"first_name.last_name@ogr.gidatarim.edu.tr"*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name (in lower case): ");
        String first_name = sc.nextLine();

        System.out.print("Enter your last name (in lower case): ");
        String last_name = sc.nextLine();

        System.out.print("Your email address: ");
        System.out.println(first_name + "." + last_name + "@" + "gidatarim.edu.tr");
    }
}