package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by ifarfan
 */
public class FindingTheLargestValue {

    /*
    Create an array that can hold ten integers, and fill each slot with a different random value from 1-50.     // DONE!!!
    Display those values on the screen, and then prompt the user for an integer.                                // DONE!!!
    Search through the array, and if the item is present, give the slot number where it is located.             // DONE!!!
    If the value is not in the array, display a single message saying so.                                       // DONE!!!
    If the value is present more than once, you may either display the message as many times as necessary,
    or display a single message giving the last slot number in which it appeared.                               // DONE!!!
     */

    public static void main(String[] args) {

        Random rand = new Random();
        int arr[] = new int[10];
        boolean isEqual = false;

        for (int i = 0; i < arr.length; i++) {
            int num = rand.nextInt(50) + 1;
            arr[i] = num;
        }

        System.out.println("Array:" + Arrays.toString(arr));

        Scanner scan = new Scanner(System.in);
        System.out.print("Value to find: ");
        int num = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println(num + " is in slot " + i);
                isEqual = true;
            }
        }

        if (isEqual == false) {
            System.out.println(num + " is not in the array.");
        }
    }
}
