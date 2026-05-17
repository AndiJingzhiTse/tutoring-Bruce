package TutoringClasses;

import java.util.Scanner;

public class Class10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter 10 words: ");

        String[] arr = new String[10];

        for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.next();
        }

        for (int i = arr.length - 1; i >= 0; i--) {

        System.out.println(arr[i]);
        }

        System.out.println("please enter 10 integers: ");

        int[] arr = new int[10];

        int i = 0;
        int num = 0;

        do {
            num = sc.nextInt();

            if (num != 0) {
                arr[i] = num;
            }
            i++;

        } while (num != 0 && i < arr.length);

    
        for(int j = 0; j< arr.length; j++){
            
            if (arr[j] >0 ) {
                System.out.println(arr[j]);
            } 
        }

        for(int j= 0 ;j < arr.length; j++){

            if (arr[j] <0 ) {
                System.out.println(arr[j]);
            } 
        }
    
        

    }
}
