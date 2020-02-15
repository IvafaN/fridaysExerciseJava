package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {
     /*
        Write a program that gets an integer from the user. Count from 0 to that number. Use a for loop to do it.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Count to:  ");
        int number = input.nextInt();

        for (int i = 0; i <= number; i ++) {
            System.out.printf("%d ", i);
        }
    }
}
