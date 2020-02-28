package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ifarfan
 */
public class LocatingTheLargestValue {

    /*
    Write a program that creates an array which can hold ten values.                            // DONE!!!
    Fill the array with random numbers from 1 to 100.                                           // DONE!!!
    Display the values in the array on the screen.                                              // DONE!!!
    Then use a linear search to find the largest value in the array, and display that value.    // DONE!!!
     */

    public static void main(String[] args) {

        Random rand = new Random();
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int num = rand.nextInt(100) + 1;
            arr[i] = num;
        }

        System.out.println(Arrays.toString(arr));

        int greaterNum = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > greaterNum) {
                greaterNum = arr[j];
            }
        }
        System.out.println("The largest value is " + greaterNum);
    }
}
