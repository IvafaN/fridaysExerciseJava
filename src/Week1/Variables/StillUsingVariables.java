package Week1.Variables;

public class StillUsingVariables {
  /*
Write a program that stores your name and year of graduation into variables, and displays their values on the screen.
Make sure that you use two variables, and that the variable that holds your name is the best type for such a variable,
and that the variable that holds the year is the best type for that variable.
Also make sure that your variable names are good: the name of a variable should always relate to its contents.
   */
  public static void main(String[] args) {

      int year = 2021;
      String name = "Ivan Farfan Razo";

      System.out.printf("My name is %s and I'll graduate in %d.", name, year);
  }
}
