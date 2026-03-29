package TutoringClasses;

import java.io.*;
import java.util.Scanner;

class Class1 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.nextLine(); // next(), nextLine()

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        System.out.println(name + ", you are " + age + " years old.");
        // name + ", you are " + age + " years old."
        // Bruce + ", you are " + 8 + " years old."
        // Bruce, you are 8 years old.
        System.out.println(name + ", in 2030 you will be " + (age + 4) + " years old.");
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
