package base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 22 - Comparing Numbers
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges
Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();
        System.out.println("Enter the third number: ");
        int c = in.nextInt();
        if(a>b&&a>c)
            System.out.println("The largest number is " + a);
        else if(b>a&&b>c)
            System.out.println("The largest number is " + b);
        else if(c>a&&c>b)
            System.out.println("The largest number is " + c);
    }
}
