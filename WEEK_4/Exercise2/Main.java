/*
Design a program that does following:
• Read a string from the user.
• Write a while loop that produces all the characters of the given string, starting with the last character
and ending with  first character.
• Display the output as expected.
For example, if the given string has the  value "COMP2003-Java", then the program must produce an output
as on the right.
*/

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String sent = sc.next();

        int i = sent.length()-1;
        String chars = "";

        while (i >=0){
            chars = sent.charAt(i) + chars;
            System.out.println(chars);
            i--;
        }

    }
}