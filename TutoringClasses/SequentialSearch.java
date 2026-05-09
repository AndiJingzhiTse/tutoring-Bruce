package TutoringClasses;

import java.io.*;
import java.util.*;

class SequentialSearch {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] arr = {133, 13, -1, 0, -999};
        int target = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                println("Found at index " + i);
            }
        }
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // true
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
