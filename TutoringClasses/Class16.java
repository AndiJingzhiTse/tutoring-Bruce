package TutoringClasses;

import java.util.Scanner;

public class Class16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int[][] sb = new int[2][3];

        // for (int r = 0; r < sb.length; r++) {

        // for (int c = 0; c < sb[r].length; c++) {

        // System.out.println("please enter 6 integers: ");
        // sb[r][c] = sc.nextInt();

        // }

        // }

        // int[][] dsb = new int[sb.length][sb[0].length];

        // for (int r = 0; r < dsb.length; r++) {

        // for (int c = 0; c < dsb[r].length; c++) {

        // System.out.println("please enter 6 integers: ");
        // dsb[r][c] = sc.nextInt();

        // }

        // }

        // boolean identical = true;

        // for (int r = 0; r < sb.length; r++) {

        // for (int c = 0; c < sb[r].length; c++) {

        // if (sb[r][c] != dsb[r][c]) {

        // identical = false;
        // }

        // }
        // }
        // if (identical) {
        // System.out.println("Identical");
        // } else {
        // System.out.println("Not identical");
        // }

        int[][] arr = new int[3][4];

        for (int r = 0; r < arr.length; r++) {

            for (int c = 0; c < arr[r].length; c++) {

                System.out.println("please enter 12 integers: ");

                arr[r][c] = sc.nextInt();
            }
        }
        /*
         * 1 2 3 4 10
         * 5 6 7 8 26
         * 9 10 11 12 42
         * 15 18 21 24
         */

        // start rolSum

        int[] rowSum = new int[arr.length];
        int[] colSum = new int[arr[0].length];

        for (int r = 0; r < arr.length; r++) {
            int acc = 0;

            for (int c = 0; c < arr[0].length; c++) {

                acc += arr[r][c];

            }
            rowSum[r] = acc;

        }

        // rolSum done start colSum

        for (int c = 0; c < arr[0].length; c++) {
            int acc = 0;

            for (int r = 0; r < arr.length; r++) {

                acc += arr[r][c];

            }
            colSum[c] = acc;

        }

        for (int r = 0; r < arr.length; r++) {

            for (int c = 0; c < arr[r].length; c++) {

                System.out.print(arr[r][c] + "\t");

            }
            System.out.print("|\t" + rowSum[r]);

            System.out.println();

        }
        for (int i = 0; i < 33; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int c = 0; c < arr[0].length; c++) {

            System.out.print(colSum[c] + "\t");

        }

    }
}
