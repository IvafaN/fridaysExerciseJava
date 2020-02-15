package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    /*
    Ask the user for their name. Then display their name to prove that you can recall it.
    Ask them for their age. Then display what their age would be five years from now.
    Then display what their age would be five years ago.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Hello.  What is your name?  ");
        String name = input.next();

        System.out.printf("Hi, %s!  How old are you?,  ", name);
        String age = input.next();

        int numAge = Integer.parseInt(age);
        int older = numAge + 5;
        int younger = numAge - 5;

        System.out.printf("Did you know that in five years you will be %d years old?\n" +
                          "And five years ago you were %d! Imagine that!  ", older, younger);
    }
}
