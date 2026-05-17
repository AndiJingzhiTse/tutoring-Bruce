package TutoringClasses;

import java.util.Scanner;

public class Class11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] marks = new double[10];
        String[] firstNames = new String[marks.length];
        String[] lastNames = new String[marks.length];


        double acc= 0;

        for (int i = 0; i < marks.length; i++) {

            System.out.println("please enter your first name, last name and mark");

            firstNames[i] = sc.next();
            lastNames[i] = sc.next();
            marks[i] = sc.nextDouble();


            if (marks[i] < 0) {
                i = marks.length;
            }

        }

        int cnt =0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 0) {
                i = marks.length;
            } else {
                System.out.print(firstNames[i]);
                System.out.print(" " + lastNames[i]);
                System.out.println(" " + marks[i]);

                acc+=marks[i];
                
                cnt++;
            }

        }
        System.out.println("the average of the class is " + acc/cnt );

    }
}
