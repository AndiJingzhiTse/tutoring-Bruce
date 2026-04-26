package TutoringClasses;

import java.util.Scanner;

public class Class7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fixedName = "Bruce";
        int countToTen = 0;
        while (countToTen < 10) {
            countToTen++;
            System.out.println(fixedName);
        }

        int countToHundred = 0;
        while (countToHundred < 100) {
            System.out.println(countToHundred);
            countToHundred++;
        }

        int reverseCount = 100;
        while (reverseCount >= 0) {
            System.out.println(reverseCount);
            reverseCount--;
        }

        System.out.println("please enter a word:");
        String userWord = sc.next();
        System.out.println("please enter how many times you want to print it:");
        int repeatCount = sc.nextInt();
        int printCounter = 0;
        while (printCounter < repeatCount) {
            System.out.println(userWord);
            printCounter++;
        }

        int sumCounter = 1;
        int sum = 0;
        while (sumCounter <= 10) {
            System.out.println(sumCounter);
            sum += sumCounter;
            sumCounter++;
        }
        System.out.println(sum / 10.0);

        String answer = "java";
        System.out.println("please enter a word=");
        String guess = sc.next();
        int guessCount = 1;
        while (!guess.equals(answer)) {
            System.out.println("Wrong please guess again");
            System.out.println("please enter a word=");
            guess = sc.next();
            guessCount++;
        }
        System.out.println("the word was=" + answer);
        System.out.println("You got it in " + guessCount + " guesses");

        int doWhileCounter = 0;
        do {
            System.out.println("bruce");
            doWhileCounter++;
        } while (doWhileCounter < 10);

        int finalCounter = 0;
        while (finalCounter < 10) {
            System.out.println("bruce");
            finalCounter++;
        }

        sc.close();

    }
}
