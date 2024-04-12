package ICETask3;

import java.util.Scanner;

public class OddSquareSum {

    public static void main(String[] args) 
    {
        Scanner MyScan = new Scanner(System.in);
        System.out.println("Enter the limit required");
        int limit = MyScan.nextInt();                                                           //input for the number of terms required

        if (limit > 0) {
            double sum = odd_squares_sum(limit);                                                //if input is greater than 0 runs code, as input cannot be  less than 1
            System.out.println("The sum of all values up until Term " + limit + " is " + sum);
        } else {
            System.out.println("Input Cannot be 0 or Negative");
        }

    }

    public static double odd_squares_sum(int limit) {
        double sum = 0;
        for (int l = 1; l <= limit; l++) {                                                      //iterates through all odd natural numbers
            int value = 2 * l - 1;                                                              //calculates the square of odd numbers for each iteration
            sum += value * value;                                                               //adds the value of the squares together until the limit is reached.
        }
        return sum;

    }

}
