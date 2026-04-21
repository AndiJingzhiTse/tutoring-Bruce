package TutoringClasses;

import java.io.*;
import java.util.*;

class Algorithm {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        // one line comment
        /*
        multi-line comment
        1. first
        2. second
        3. third
        */
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
