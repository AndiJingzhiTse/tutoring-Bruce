package TutoringClasses;

import java.util.Scanner;

public class Class9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1.prompt user to enter there what year they were born
        // 2.Get input and store it (year)
        // 3.calculate how old they will be this year
        // a. ageNow = 1026 - year
        // 4.output how old the user is now
        // 5.calculate how old they will be in the year 2030
        // a.ageFuture = 2030 - year
        // 6.output the user how old they are in 2030
        // 7.prompt the user to enter whether or not they would like to continue
        // (yes/no)
        // 8.Get input & store it (response)
        // 9. if the reponse is "yes", repeat from point 1 using do while
        // String response ;
        // do {
        // System.out.println("please enter what year you were born");
        // int yearBorn = sc.nextInt();
        // int year = 2026;
        // int ageNow = year - yearBorn;
        // System.out.println("you will be "+ ageNow + "years old in 2026");
        // int future = 2030;
        // int ageFuture = future - yearBorn;
        // System.out.println("you will be "+ ageFuture + " years old in 2030");
        // System.out.println("would you like to continue Yes or No");
        // response = sc.next();
        // } while(response.equals("Yes"));
        // declare variables
        // assign variable countdown = 10
        // assign variable cnt = 0
        // use do while loop
        // declare variables
        // assign variables equal ((int) Math.random() * 100) + 1 (randomNum)
        // do {
        // countdown-- cnt++
        // prompts the user to guess the number (guess)
        // a)
        // if guess == randomNum you are correct
        // b)
        // if randomNum > guess , output the guess is too low
        // if randomNum < guess, output the guess is too high

        /// while (guess!=randomNum && cnt > 0);
        // output cnt
        //

        // int acc = 0;
        // for (int i = 0; i < 20; i++) {
        // int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
        // 19, 20};
        // System.out.println(arr1[i]);
        // acc+= arr1[i];

        // }

        // System.out.println(acc);

        // System.out.println("please enter ten numbers: ");
        // int[] arr = new int[20];

        // for (int i = 0; i < arr.length; i++) {
        // int num = sc.nextInt();
        // arr[i] = num;

        // for (int i = 0; i < arr.length; i++) {

        // System.out.println(arr[i]);

        // }

        // for (int i = arr.length - 1; i >= 0; i--) {

        // System.out.println(arr[i]);

        // }

        // for (int i = 0; i < 10; i++) {
        // if (arr[i] >= 0) {
        // System.out.println(arr[i]);
        // }

        // }

        // for (int i = 0; i < 10; i++) {
        // if (arr[i] < 0) {
        // System.out.println(arr[i]);
        // }

        // System.out.println("please give a limit:");

        // int limit = sc.nextInt();

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] >= limit) {
        // System.out.println(arr[i]);
        // }
        // }

        System.out.println("please enter 10 lastnames, firstnames, and marks (0-100)");

        String[] lN = new String[10];
        int[] M = new int[lN.length];
        String[] fN = new String[M.length        ];

        for (int i = 0; i < lN.length; i++) {

            fN[i] = sc.next();

            lN[i] = sc.next();

            M[i] = sc.nextInt();

        }
        System.out.println("please enter pass or fail");
        String condition = sc.next();

        if (condition.equals("pass")) {

            for (int i = 0; i < M.length; i++) {

                if (M[i] >= 50) {
                    System.out.println(fN[i] + lN[i]+ M[i]);

                }
                
            }

        }
        if (condition.equals("fail")) {

            for (int i = 0; i < M.length; i++) {

                if (M[i] < 50) {
                    System.out.println(fN[i] + lN[i]+ M[i]);

                }
                
            }

        }
    }

}
