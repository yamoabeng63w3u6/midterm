package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        //using iteration

        int f = 5;// using for 5
        int result = 1;// start from 1
        for (int i = 1; i <= f; i++) {
            result = result * i;

            System.out.println("The Factional of " + i + ": " + result);
        }
        System.out.println("The Factorial of 5 : " + result);// we also caf put ifside the loop
        //it will show what happened inside the loop
        //System.out.println("The factorial of 5 is :" + factorial(10));
        System.out.println("The factorial of 5 is :" + (5));

    }


//factorial of 5
//using Recursion

    public static int factorial(int f) {
        if (f == 0) {
            return 1;
        } else {
            return f * factorial(f - 1);
        }
    }
}










        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.








