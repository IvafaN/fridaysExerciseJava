package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ifarfan
 */
public class WhereIsIt {

    /*
    Write a program that creates an ArrayList of Integers.                                                              // DONE!!!
    Fill the ArrayList with random numbers from 1 to 100.                                                               // DONE!!!
    Display the values in the ArrayList on the screen.                                                                  // DONE!!!
    Then use a linear search to find the largest value in the ArrayList, and display that value and its slot number.    // DONE!!!
     */

    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        int greaterValue = 0;
        int slot = 0;
        int n = 0;

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
                slot = n;
            }
            n++;
        }

        System.out.println();
        System.out.println("The largest value is " + greaterValue +", which is in slot " + slot + ".");
    }
}
