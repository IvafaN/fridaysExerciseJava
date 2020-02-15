package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    /*
    Write a program that gets several integers from the user.
    Sum up all the integers they give you.
    Stop looping when they enter a 0.
    Display the total at the end.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int intNumber = 1;
        int sumNums = 0;

        System.out.printf("I will add up the numbers you give me.");

        while (intNumber != 0) {
            System.out.printf("\nNumber:  ");
            String number = input.next();
            intNumber = Integer.parseInt(number);
            sumNums = sumNums + intNumber;

            if (intNumber != 0) {
                System.out.printf("The total so far is %d.", sumNums);
            }
        }
        System.out.printf("\nThe total is %d.  ", sumNums);
    }
}
