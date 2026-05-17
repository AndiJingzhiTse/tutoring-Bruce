package TutoringClasses;

import java.util.Scanner;

public class Class17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int[][] rows = new int[3][];

        // // jagged array
        // rows[0] = new int[3];
        // rows[1] = new int[2];
        // rows[2] = new int[4];

        // for (int r = 0; r < rows.length; r++) {

        // for (int c = 0; c < rows[r].length; c++) {

        // System.out.println("please enter the integer at row " + (r + 1) + " column "
        // + (c + 1));

        // rows[r][c] = sc.nextInt();

        // }
        // }

        // int[] rowSum = new int[rows.length];

        // for (int r = 0; r < rows.length; r++) {

        // int acc = 0;

        // for (int c = 0; c < rows[r].length; c++) {

        // acc += rows[r][c];
        // }

        // rowSum[r] = acc;

        // }

        // for (int r = 0; r < rows.length; r++) {

        // for (int c = 0; c < rows[r].length; c++) {

        // System.out.print(rows[r][c] + " ");

        // }

        // System.out.print(rowSum[r]*1.0/rows[r].length);
        // System.out.println();
        // }

        System.out.println("please enter an integer for n");
        int n = sc.nextInt();

        int[][] sb = new int[n][n];

        for (int r = 0; r < sb.length; r++) {

            for (int c = 0; c < sb[r].length; c++) {

                System.out.println("please enter the integer at row " + (r + 1) + " column " + (c + 1));
                sb[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < sb.length; r++) {

            for (int c = 0; c < sb[r].length; c++) {

                System.out.print(sb[r][c] + " ");
            }
            System.out.println();
        }

        for (int r = 0; r < sb.length-1; r++) {

            for (int c = r+1; c < sb[r].length; c++) {

                int temp =sb[c][r];
                
                sb[c][r] = sb[r][c];

                sb[r][c]=temp;

            }
        }

        for (int r = 0; r < sb.length; r++) {

            for (int c = 0; c < sb[r].length; c++) {

                System.out.print(sb[r][c] + " ");
            }
            System.out.println();
        }
        // output[1][2] = input[2][1]
        // output[r][c] = input[c][r]

        // int[][] cnm = new int[n][n];

        // for (int r = 0; r < sb.length; r++) {

        // for (int c = 0; c < sb[r].length; c++) {

        // cnm[c][r] = sb[r][c];

        // }
        // }

        // for (int r = 0; r < sb.length; r++) {

        // for (int c = 0; c < sb[r].length; c++) {

        // System.out.print(cnm[c][r] + " ");
        // }
        // System.out.println();
        // }

    }
}
