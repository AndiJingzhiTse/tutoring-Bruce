package TutoringClasses;

import java.io.*;
import java.util.*;

class Class {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException { // method

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        arr = transpose(arr);
        /*
        main method called tranpose method
        main is the caller
        tranpose is the callee
         */

        print2DArr(arr);

        print("Please enter an integer: ");
        int a = sc.nextInt();
        print("Please enter an integer: ");
        int b = sc.nextInt();

        print("The multiplied result is: " + mult(a, b));

    }

    /*
    add1 takes an int, and return the incremented int
     */
    public static int add1(int num) {
        num++;
        return num;
        // return ++num;
    }

    /*
    mult takes 2 integers, and returns the multiplied result
     */
    public static int mult(int a, int b) {
        return a * b;
        /*
        int num = a * b;
        return num;
         */
    }

    /*
    access modifier (g12)
    static (optional, g12)
    return type (void, int, double, String, int[], etc...)
    method name
    (parameter list, , ...)
     */
    public static int[][] transpose(int[][] input) {

        for (int r = 0; r < input.length - 1; r++) {

            for (int c = r + 1; c < input[r].length; c++) {

                int temp = input[c][r];

                input[c][r] = input[r][c];

                input[r][c] = temp;

            }
        }

        return input;
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

    public static void printArr(int[] arr) {
        for (int obj : arr) {
            print(obj + " ");
        }
        println();
    }

    public static void printArr(double[] arr) {
        for (double obj : arr) {
            print(obj + " ");
        }
        println();
    }

    public static void print2DArr(Object[][] arr) {
        for (Object[] subArr : arr) {
            printArr(subArr);
        }
    }

    public static void print2DArr(int[][] arr) {
        for (int[] subArr : arr) {
            printArr(subArr);
        }
    }

    public static void print2DArr(double[][] arr) {
        for (double[] subArr : arr) {
            printArr(subArr);
        }
    }
}
