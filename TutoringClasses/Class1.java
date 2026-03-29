package TutoringClasses;

import java.io.*;
import java.util.Scanner;

class Class1 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter an integer: ");
        // int num = sc.nextInt();
        // System.out.println("num: " + num); // "num: " + 5 => "num: 5"
        // double twice = num * 2.0; // 5 * 2.0 => 10.0
        // System.out.println("twice: " + twice); // "twice: " + 10.0 => "twice: 10.0"

        System.out.print("Enter the diameter of the pizza in inches: ");
        int diameter = sc.nextInt();
        double cost = diameter * diameter * 0.05 + 1.75;
        System.out.println("The cost of making the pizza is: $" + cost);

        /*
        if (true/false weather greater than 30) {
            // code to execute if condition is true
            wear shorts
        } else {
            // code to execute if condition is false
        }
         */
        if (diameter > 14) {
            System.out.println("The pizza falls under the large category");
        } else {
            System.out.println("The pizza is either a Small or Medium Pizza");
        }
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
