package TutoringClasses;

import java.util.Scanner;

public class Class12 {

    public static void main(String[] args) {

        for (int i = 10;i<15;i++){
            if(i==12){
                continue;
            }
            System.out.println(i);
            
        }

        Scanner sc = new Scanner(System.in);

        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("please enter 5 strings: ");
            words[i] = sc.next();

        }

        System.out.println("please tell me the string to be searched: ");
        String target = sc.next();

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                System.out.println("Found");
                // when we can a target, we can stop searching
                break;
            } else if(i == words.length-1){
                System.out.println("Not Found");
            }

        }

        

    }
}
