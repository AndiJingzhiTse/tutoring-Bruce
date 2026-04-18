package TutoringClasses;

import java.util.Scanner;

public class Class6 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("please enter 5 integers = ");
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int secondMax = Integer.MIN_VALUE;
        int secondMaxIndex = 0;
        for (int i = 1; i <= 5; i++) {
            int newNum = myScanner.nextInt();

            if (newNum >= max) {
                secondMax = max;
                max = newNum;
                secondMaxIndex = maxIndex;
                maxIndex = i;
            } else if (newNum > secondMax) {
                secondMax = newNum;
                secondMaxIndex = i;
            }

        }
        // 1 2 3 4 5 6
        // 1 3 2 0 0 0 4

        System.out.println("integer " + secondMaxIndex + "is the second largest");
    }
}