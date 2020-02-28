package Week2.Arrays;

import java.util.Random;

/**
 * Created by ifarfan
 */
public class BasicArrays2 {

    /*
    Create an array that can hold ten integers. // DONE!!!
    Fill up each slot of the array with a random number from 1 to 100. // DONE!!!
    Then display the contents of the array on the screen. You must use a loop.And, like last time, // DONE
    you must use the length field of your array and not a literal number (like 10) in the condition of the loop. // DONE
     */

    public static void main(String[] args) {

        Random rand = new Random();
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int num = rand.nextInt(100) + 1;
            arr[i] = num;
            System.out.print(arr[i] + ", ");
        }
    }
}
