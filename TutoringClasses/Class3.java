package TutoringClasses;

import java.io.*;
import java.util.*;

class Class3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*
        if (some condition) { // mandatory
            // execute this code if the condition is true
        } else if (another condition) { // optional, can have many in the chain
            // execute if the block above is not executed, and this condition is true
        } else { // optional, only 1 else per if
            // if they block above is not executed, this executes
        } else if (true) {
            // exact same functionality as else, but terrible practice 
        }



         */

        // if (3 > 2) {
        //     System.out.println("3 is greater than 2");
        // }
        // ask if the user for 2 int, output "First number is greater" if it is
        // output "Second number is greater than or equal to the first number" if it is
        // ask if the user for 2 int, output "First number is greater" if it is
        // otherwise, output "Second number is greater than or equal to the first number"
        // System.out.print("Please enter two integer: ");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // // data type booleans are true or false
        // // (num1 > num2) is either true or false
        // if (num1 > num2) {
        //     System.out.println("First number is greater");
        // } else {
        //     System.out.println("Second number is greater than or equal to the first number");
        // }
        // ask for any number, print "Positive" if it is, print "0" if it is, print "Negative" otherwise
        // System.out.print("Please enter a number: ");
        // double num = sc.nextDouble();
        // if (num > 0) {
        //     System.out.println("Positive");
        // } else if (num == 0) {
        //     System.out.println("0");
        // } else {
        //     System.out.println("Negative");
        // }
        // System.out.println("Please enter an integer for temperature: ");
        // int temperature = sc.nextInt();
        // if (temperature > 30) {
        //     System.out.println("It is hot");
        // } else if (temperature >= 20) {
        //     System.out.println("It is comfortable");
        // } else if (temperature >= 10) {
        //     System.out.println("It is cool");
        // } else {
        //     System.out.println("It is getting really cold");
        // }
        boolean t = true;
        boolean f = !t;
        boolean and = t && f;
        boolean or = t || f;

        // if (temperature > 30 or I'm going swimming), I will wear shorts
        // boolean wearShort = temperature > 30 or I'm going swimming 
        /*
        logical operator
        AND (&&)     true or true = true, false or true = false, true or false = false, false or false = false
        OR (||)      true or true = true, false or true = true, true or false = true, false or false = false
        NOT (!)
         */
        System.out.println("Please enter an integer for temperature: ");
        int temperature = sc.nextInt();

        if (temperature > 30) {
            System.out.println("It is hot");
        }
        // temperature is between 20 to 30 (inclusive), equivalent to 20 <= temperature <= 30, equivalent to 20 <= temperature and temperature <= 30
        if (20 <= temperature && temperature <= 30) {
            System.out.println("It is comfortable");
        }
        if (temperature >= 10 && temperature <= 19) {
            System.out.println("It is cool");
        }
        if (temperature <= 9) {
            System.out.println("It is getting really cold");
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
