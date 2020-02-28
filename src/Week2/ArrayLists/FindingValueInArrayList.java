package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by ifarfan
 */
public class FindingValueInArrayList {

    /*
    Create an ArrayList that can hold Integers, and fill each slot with a different random value from 1-50.     // DONE!!!
    Display those values on the screen, and then prompt the user for an integer.                                // DONE!!!
    Search through the ArrayList, and if the item is present, say so.                                           // DONE!!!
    It is not necessary to display anything if the value was not found.                                         // DONE!!!
    If the item is in the ArrayList multiple times, it's okay if the program prints the message more than once. // DONE!!!
     */

    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();

        int i = 0;
        while (i < 10) {
            int num = rand.nextInt(50) + 1;
            listNumbers.add(num);
            i++;
        }

        System.out.println(listNumbers);

        Scanner scan = new Scanner(System.in);
        System.out.print("Value to find: ");
        int num = scan.nextInt();

        for (Integer number : listNumbers) {
            if (num == number) {
                System.out.println(num + " is in the array list.");
            }
        }
    }
}
