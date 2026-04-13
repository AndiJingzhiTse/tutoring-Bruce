package TutoringClasses;

import java.io.*;
import java.util.*;

class Class4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//         // prompt the user for an int, if it is divisible by 3, print "Fizz", if it is divisible by 5, print "Buzz", if it is divisible by both, print "FizzBuzz", otherwise print the number
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter a number: ");
//         int num = sc.nextInt();

//         /*
//         if(){}
//         optional (none, 1, or many):
//         else if(){}
//         optional (none, 1)
//         else{}
//          */
//  /*
//         logical operator
//         and &&
//         or ||
//         not !
//          */
//         if (num % 3 == 0) { // modulus
//             System.out.print("Fizz");
//         }
//         if (num % 5 == 0) {
//             System.out.print("Buzz");
//         }
//         if (num % 3 != 0 && num % 5 != 0) {
//             System.out.print(num);
//         }
// i++ increments (add 1) i
// i-- decrements (minus 1) i
// for is a keyword
// i stands for index
        // for (int i = -5; i <= 5; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i + " is an even number");
        //     } else {
        //         System.out.println(i + " is a odd number");
        //     }
        // }
        // for (int num = 2; num < 500; num++) {
        //     if ((num % 3 == 0) && (num % 4 == 0) && (num % 5 == 0)) {
        //         System.out.println(num);
        //     }
        // }
        // for (int num = 0; num <= 100; num++) {
        //     System.out.println(num);
        // }
        // for (int num = 100; num >= 0; num--) {
        //     System.out.println(num);
        // }
        // System.out.println("Please enter a word: ");
        // String word = sc.next();
        // System.out.println("How many times to print it: ");
        // int num = sc.nextInt();
        // for (int i = 0; i < num; i++) { // take care of how many times executed
        //     // what to be executed
        //     System.out.println((i + 1) + ". " + word);
        // }
        // System.out.println("Please enter an int at which to start counting: ");
        // int start = sc.nextInt();
        // System.out.println("Please enter an int at which to stop counting: ");
        // int stop = sc.nextInt();
        // for (int num = start; num <= stop; num++) {
        //     println(num);
        // }
        // int count = 0;
        // for (int num = 2; num < 500; num++) {
        //     if ((num % 3 == 0) && (num % 4 == 0) && (num % 5 == 0)) {
        //         println(num);
        //         count++;
        //         count = count + 1;
        //     }
        // }
        // System.out.println("There are " + count + " multiples of 2, 3, and 5");
        // int num = 2 + 3
        // int count = 0;
        // for (int num = 1; num <= 100; num++) {
        //     if (num % 2 == 0) {
        //         // System.out.println(num);
        //         count++;
        //     }
        // }
        // System.out.println("There are " + count + " even numbers");
        // accumulator

        /*
        there are equivalent
        num++ // increment num
        num += 1 // increment num by 1
        num = num + 1
         */
        // int acc = 0;
        // for (int num = -10; num <= 10; num++) {
        //     acc += num; // acc = acc + num
        // }
        // println(acc);
        int acc = 0;

        System.out.print("Please enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            // 0 ... 4, 5 times
            int num = sc.nextInt();
            acc += num;
        }
        System.out.println("The sum of 5 numbesr is: " + acc);
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
