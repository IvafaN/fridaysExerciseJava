package Week1.ForLoops;

public class FizzBuzz {
    /*
    Write a program that prints the numbers from 1 to 100.
    But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
    For numbers which are multiples of both three and five print "FizzBuzz".
     */

    public static void main(String[] args) {

        int n = 100;

        for (int i=1; i<=n; i++)
        {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz\n");
            } else if (i % 5 == 0) {
                System.out.print("Buzz\n");
            } else if (i % 3 == 0) {
                System.out.print("Fizz\n");
            } else {
                System.out.printf("%d\n", i);
            }
        }
    }
}
