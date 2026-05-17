package TutoringClasses;

import java.util.Scanner;

public class Class13 {

    public static void main(String[] args) {

        /*
        swap num[2] with num[5]
        */

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {

            System.out.println("please enter 5 int: ");
            num[i] = sc.nextInt();

        }

        int largest = 0;
        int secL = 0;

        int largestIndex = 0;
        int secLIndex = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                secL = largest;
                largest = num[i];
                secLIndex = largestIndex;
                largestIndex = i;

            } else if (num[i] > secL && num[i] <= largest) {
                secL = num[i];

                secLIndex = i;

            }

        }
        // System.out.println("the second largest is" + secL);
        // System.out.println("the largest is " + largest);

        // input: 1,4,2,5,3
        // output: 1,5,2,4,3

        // when we encounter 5 (i is 3), largestIndex = 1, secLIndex = 2.
        // secLIndex = 1, largestIndex = 3

        /*
        largestIndex = 3
        secLIndex = 1
        num[1] = 4
        num[3] = 5
        temp = 0
        
        num[1] = 5
        num[3] = 4
        temp = 5        

         */

        
        
        int temp = 0;
        temp = num[largestIndex];
        num[largestIndex] = num[secLIndex];
        num[secLIndex] = temp;

        /*
        let's say if ur going to swap num[0] with num[1]
        int temp = 0; // doesn't matter the initial value
        temp = num[0]; // let temp = one of the values, back up that value
        num[0] = num[1]; // let the backed up element take the other value
        num[1] = num[0]; // let the other value = the backed up value
        */

        for (int i = 0; i < 5; i++) {

            

            System.out.print(num[i]);
        }

        // 1,5,2,4,3
        // output: 1,4,2,5,3

    }
}
