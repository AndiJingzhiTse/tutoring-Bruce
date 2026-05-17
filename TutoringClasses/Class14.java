package TutoringClasses;

import java.util.Scanner;

public class Class14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = { 1, 92, 31, 24, 66 };

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];

                    nums[j] = nums[j + 1];

                    nums[j + 1] = temp;

                }

            }

        }
        for (int i = 0; i < nums.length; i++) {

            System.out.println(nums[i]);
        }

    }
}
