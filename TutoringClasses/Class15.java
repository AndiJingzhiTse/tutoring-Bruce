package TutoringClasses;

import java.util.Scanner;

public class Class15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        // System.out.println(num++);
        for(num = 0;++num<3;System.out.println(num++)){

        }
        System.out.println(num);

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("please enter 10 integers");
            nums[i] = sc.nextInt();

        }
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];

                    nums[j] = nums[j + 1];

                    nums[j + 1] = temp;

                }

            }
        }

        for (int i = 0; i < nums.length; i++) {
        System.out.println(nums[i]);

        }

        int max = 0;
        int[][] num = { { 1, 2 }, { 3, 4, 5 } };
        for (int r = 0; r < num.length; r++) {

            for (int c = 0; c < num[r].length; c++) {
                if (num[r][c] > max) {

                    max = num[r][c];

                }

            }

        }
        System.out.println(max);
    }
}
