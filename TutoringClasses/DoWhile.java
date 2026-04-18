package TutoringClasses;

import java.io.*;
import java.util.*;

class DoWhile {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*
        do {
        
        } while (some condition);
         */
        int num = 0;
        do { 
            System.out.println("please enter a positive number");
            num = sc.nextInt();
        } while (num <= 0);
        // calculate oil price
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
