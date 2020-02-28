package Week2.Arrays;
import java.util.*;
import java.util.Random;

/**
 * Created by ifarfan
 */
public class CopyingArrays {

    /*
    Write a program that creates an array of ten integers. // DONE!!!
    It should put ten random numbers from 1 to 100 in the array. // DONE!!!
    It should copy all the elements of that array into another array of the same size. // DONE!!!
    Then display the contents of both arrays. To get the output to look like mine, you'll need a several for loops.// DONE!!!

    Create an array of ten integers
    Fill the array with ten random numbers (1-100)
    Copy the array into another array of the same capacity
    Change the last value in the first array to a -7 // DONE!!!
    Display the contents of both arrays
     */

    public static void main(String[] args) {

        Random rand = new Random();
        int arr[] = new int[10];
        int newArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = rand.nextInt(100) + 1;
            arr[i] = num;
        }

        for (int j = 0; j < newArr.length; j++) {
            newArr[j] = arr[j];
        }

        arr[arr.length - 1] = -7;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }
}
