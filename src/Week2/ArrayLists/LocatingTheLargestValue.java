package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ifarfan
 */
public class LocatingTheLargestValue {

    /*
    Write a program that creates an ArrayList which can hold Integers.                              // DONE!!!
    Fill the ArrayList with random numbers from 1 to 100.                                           // DONE!!!
    Display the values in the ArrayList on the screen.                                              // DONE!!!
    Then use a linear search to find the largest value in the ArrayList, and display that value.    // DONE!!!
     */

    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        int greaterValue = 0;

        int i = 0;
        while (i < 10) {
            int num = rand.nextInt(100) + 1;
            listNumbers.add(num);
            i++;
        }

        System.out.println(listNumbers);

        for (Integer number : listNumbers) {
            if (number > greaterValue) {
                greaterValue = number;
            }
        }

        System.out.println();
        System.out.println("The largest value is " + greaterValue);
    }
}
