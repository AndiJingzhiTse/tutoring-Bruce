package TutoringClasses;

import java.io.*;
import java.util.*;

public class RandomNumber {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*
        -2x + 1 < 5
        -2x < 4
        x > -2
         */

        double ran = Math.random(); // [0,1)
        System.out.println(ran);

        double ran10 = Math.random() * 10; // [0, 10)
        System.out.println(ran10);

        int numInt10 = ((int) (Math.random() * 10)) + 1; // [0, 9] - > [1,10]
        System.out.println(numInt10);

        // [10,20] int
        int numInt1020 = ((int) (Math.random() * 11)) + 10;
        System.out.println(numInt1020);
        /*
        [0,1)
        [0,11)
        [0,10]
        0.1, 0.2, 0.99, 0 -> 0
        [0,1) -> 0
        [1,2) -> 1
        ...
        [10,11) -> 10
        [0,10]
        [10,20]

        [num1, num2]
        ((int) (Math.random() * (num2 - num1 + 1))) + num1;
        [15, 25] -> num1 = 15, num2 = 25
         */
        int numInt1525 = ((int) (Math.random() * 11)) + 15;
        System.out.println(numInt1525);
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
