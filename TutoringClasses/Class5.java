package TutoringClasses;

import java.util.Scanner;

public class Class5 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // double acc = 0;

        // for (int i = 0; i < 6; i++) {
        // double marks = myScanner.nextDouble();
        // acc += marks;
        // }
        // System.out.println("The aversge of six marks is = " + acc / 6);
        // int acc = 0;
        // for (int i = 1; i <= 5; i++) {
        // acc += i;
        // }
        // System.out.println("the sum from 1 to 5 is = " + acc);
        // 3 2 6 2 48 45 6 2 346 3456 234 2 234 4 456 34 4 5 5 7 2 3 2 3 4 5 6 7 8 9 10
        // 1111 1111
        // int high = 0;
        // for (int i = 0; i < 5; i++) {
        // int num = myScanner.nextInt();
        // if (num > high) {
        // high = num;
        // }
        // System.out.println("The highest number is: " + high);

        // }

        int low =Integer.MAX_VALUE;
        int minIndex = 0;
    
        System.out.println("please enter 5 integers");
        for (int i = 1; i <= 5; i++) {

            int num = myScanner.nextInt();
            if (num < low) {
                low = num;
                minIndex = i;

            }
        }
        System.out.println("the " + minIndex + "ths is lowest number ");
    }

}