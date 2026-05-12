package TutoringClasses;

import java.util.*;

class Class {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6}; // n = 6

        /*
        comparison/swap
        traversal: pass through the array
        iteration: execute the for loop body once

        nested loop
        2 layer loop: outer loop, inner loop
        */

        for (int i = 0; i < nums.length - 1; i++) {
            // i is the number of elements that we skip comparison
            // start from full traversal, decrease the number of comparison once
            // in the last traversal, only 1 comparison, skip n - 2 elements, which matches i < nums.length - 1
            for (int j = 0; j < nums.length - 1 - i; j++) {
                // inner loop is for each traversal
                // n - i - 1
                // last iteration: j = n - 2 - i
                // compare jth element with (j+1)th element
                // in the last iteration, compare (n-2-i)th element with (n-1-i)th element
                if (nums[j] > nums[j + 1]) {
                    // if jth element > (j+1)th element, then swap
                    // this is increasing order
                    // if we want decreasing order, change the if to <
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
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
