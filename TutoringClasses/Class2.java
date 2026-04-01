package TutoringClasses;


/*
Date: March 31, 2026
Author: Bruce
Topic: Input and Output, Variables, Data Types, Operators, Math Class
*/

import java.io.*;
import java.util.*;

class Class2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // prompt the user to enter their name once, store first name and last name in separate variables, and print out the full name
        // assume that first name and last name are separated by a space, both are single word

        /*
        sdafhasf
        a
        sdfsadf
        asdpf
        asfd
        asdfasdfadf
         */
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Please enter your full name: ");
        // String firstname = sc.next();
        // String lastname = sc.next();
        // System.out.println(firstname + " " + lastname);
        // System.out.print("Please enter two numbers: ");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // System.out.println("The product of the two numbers is: " + num1 * num2);
        // int num1 = 10;
        // int num2 = 20;
        // System.out.println("The product of the two numbers is: " + num1 * num2);
        // System.out.print("Enter the first number: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter the second number: ");
        // int num2 = sc.nextInt();
        // System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        // System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        // System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        // System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        // System.out.print("Please enter the length of the door in inches: ");
        // double length = sc.nextDouble();
        // System.out.println("The length in centimeters is: " + (length * 2.54) + " cm");

        // double num = 19.56;
        // double rounded = Math.round(num * 10) / 10.0;

        // /*
        // if / 10.0
        // 195.6
        // 196 (int)
        // 19.6 (double)
        // */

        // /*
        // this is if / 10
        // 195.6
        // 196 (int)
        // 19 (int)
        // */

        // println(rounded);

        // System.out.print("Please enter the subject: ");
        // String subject = sc.nextLine();
        // System.out.print("Please enter the total number of marks in the test: ");
        // double totalMarks = sc.nextDouble();
        // System.out.print("Please enter your test mark: ");
        // double testMark = sc.nextDouble();
        // System.out.print(subject + ", " + testMark / totalMarks * 100 + "%");

        // declare variables
        int area;
        int width;
        int length;

        // assign hardcoded values to variables
        width = 16;
        length = 10;

        // compute area
        area = width * length; 

        // output message
        System.out.print("The area of the carpet is: " + area);
    }

    public static void println() {
        System.out.println();
    }

    public static void println(Object obj) {
        System.out.println(obj);
    }

    public static void print(Object obj) {
        System.out.print(obj);
    }

    public static void printArr(Object[] arr) {
        for (Object obj : arr) {
            print(obj + " ");
        }
        println();
    }

    public static void print2DArr(Object[][] arr) {
        for (Object[] subArr : arr) {
            printArr(subArr);
        }
    }
}
