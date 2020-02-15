package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    /*
    Ask the user for their name. Then display their name to prove that you can recall it.
    Ask them for their age. Then display that. Finally, ask them for how much they make and display that.
    You should use the most appropriate data type for each variable.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Hello.  What is your name?  ");
        String name = input.next();

        System.out.printf("Hi, %s!  How old are you?  ", name);
        String age = input.next();

        System.out.printf("So you're %s, eh?  That's not old at all!\n" +
                            "How much do you make, %s?  ", age, name);

        String money = input.next();
        System.out.printf("%s!  I hope that's per hour and not per year! LOL!", money);
    }
}
