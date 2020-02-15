package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    /*
    Using if statements, else if, and else statements,
    make a program which displays a different message depending on the age given.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Hey, what's your name? (Sorry, I keep forgetting.)  ");
        String name = input.next();

        System.out.printf("Ok, %s, how old are you?  ", name);
        String age = input.next();

        int numAge = Integer.parseInt(age);
        String text = "";
        if (numAge > 25) {
            text = "You can do pretty much anything";
        } else if (numAge >= 18 ) {
            text = "You can vote but not rent a car";
        } else  if (numAge >= 16) {
            text = "You can drive but not vote";
        } else {
            text = "You can't drive";
        }

        System.out.printf("%s, %s.", text, name);
    }
}
