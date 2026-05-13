package TutoringClasses;

import java.io.*;
import java.util.*;

class TwoDArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] oneDArray = new int[5]; // the elements are int
        int[][] twoDArray = new int[3][4]; // row = 3, col = 4 2d array, rectangular array
        int[][] a = {{1, 2}, {3, 4, 5}}; // jagged array
        /*
        1, 2
        3, 4, 5
         */

        // prompt the user to fill up this 3x4 array, print the array after
        for (int r = 0; r < twoDArray.length; r++) {
            for (int c = 0; c < twoDArray[0].length; c++) {
                System.out.println("Please enter the integer in row " + r + ", col " + c + ": ");
                twoDArray[r][c] = sc.nextInt();
            }
        }
        for (int r = 0; r < twoDArray.length; r++) {
            // outer for loop print a row
            for (int c = 0; c < twoDArray[0].length; c++) {
                // inner for loop print an element in that row
                // System.out.println(twoDArray[r][c] + " ");
                System.out.print(twoDArray[r][c] + " ");
            }
            // line break since this row finished printing
            System.out.println();
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
