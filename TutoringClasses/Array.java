package TutoringClasses;

import java.io.*;

public class Array {

    public static void main(String[] args) throws IOException {
        // for every number we want to store, we had to use a variable
        // array data structure
        // 1, 2, 3, 4, 9, 10, 126, -3
        // <data_type>[] array_name = new <data_type>[<length>];
        int[] arr = new int[5]; // declared an int array arr with length 5, arr can store 5 int
        int[] arr1 = {133, 13, -1, 0, -999}; // save work

        /*
        int[] arr1 = new int[5];
        arr1[0] = 133;
        arr1[1] = 13;
        arr1[2] = -1;
        arr1[3] = 0;
        arr1[4] = -999;
         */
        
        arr[0] = -3; // 0-index
        System.out.println(arr[0]); // -3
        arr[0] = -5;
        System.out.println(arr[0]); // -5
        System.out.println(arr.length); // 5

        arr[1] = 11;
        arr[2] = 12;
        arr[3] = 13;
        arr[4] = 14;
        // arr = [-5, 11, 12, 13, 14]

        int num = arr[0];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
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
