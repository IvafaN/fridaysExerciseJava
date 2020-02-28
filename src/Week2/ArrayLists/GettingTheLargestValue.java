package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by ifarfan
 */
public class GettingTheLargestValue {

    /*
    Create an ArrayList that can hold Integers, and fill each slot with a different random value from 1-50.     // DONE!!!
    Display those values on the screen, and then prompt the user for an integer.                                // DONE!!!
    Search through the ArrayList, and if the item is present, give the slot number where it is located.         // DONE!!!
    If the value is not in the ArrayList, display a single message saying so.
    If the value is present more than once, you may either display the message as many times as necessary, or
    display a single message giving the last slot number in which it appeared.
     */

    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        boolean isNumber = false;
        int slot = 0;

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
                System.out.println(num + " is in slot " + slot + ".");
                isNumber = true;
            }
            slot++;
        }

        if (isNumber == false) {
            System.out.println(num + " is not in the ArrayList.");
        }
    }
}
