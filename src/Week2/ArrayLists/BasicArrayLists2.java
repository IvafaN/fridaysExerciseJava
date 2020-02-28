package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ifarfan
 */
public class BasicArrayLists2 {

    /*
    Create an ArrayList of Integers.                                                                            // DONE!!!
    Fill up the list with ten random numbers, each from 1 to 100.                                               // DONE!!!
    Then display the contents of the ArrayList on the screen.
    You must use a loop to fill up the list. However, you may display it the easy way (no loop needed) like so:
     */

    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();

        int i = 0;
        while (i < 10) {
            int num = rand.nextInt(100) + 1;
            listNumbers.add(num);
            i++;
        }

        System.out.println(listNumbers);
    }
}
