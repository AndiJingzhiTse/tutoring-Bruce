package TutoringClasses;

import java.io.*;
import java.util.*;

class While {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*
        if(condition){
            some code
        }

        while(condition){
            some code
        }

         */

        // int sum = 1;
        // while(sum < 10){
        //     sum*=2; // sum = sum * 2;
        // }
        // System.out.println(sum); // 16
        // double pi = 3.1415926;
        // double pi = Math.pi;
        // // cnt = 0
        // // acc = 2
        // int cnt = 0; // counter
        // int acc = 2;
        // while(cnt < 4){ 
        //     acc *=3;
        //     cnt++;
        //         }
        //         System.out.println(acc/cnt);
        //         /*
        //         162 / 4 = 40 r 2 = 40
        //         int / int
        //         50 / 3 = 16
        //         162 / 4.0 = 40.5
        //         */
        int cnt = 0;
        double acc = 2;
        while (acc < 10) {
            acc *= 2; // acc = acc * 2;
            cnt += 2;
        }
        System.out.println(acc / cnt); // 16 / 6

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
