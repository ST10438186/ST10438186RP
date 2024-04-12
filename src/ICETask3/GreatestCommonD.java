package ICETask3;


import java.util.Scanner;

public class GreatestCommonD {
    
    public static void main(String[] args) 
    {
        Scanner MyScan = new Scanner(System.in);
        
        System.out.println("Enter the First Number");
        int a = MyScan.nextInt();                                                                       //Input for Variable a
        
        System.out.println("Enter the Second Number");
        int b = MyScan.nextInt();                                                                       //Input for Variable b
        
        int ComDiv = CommonDivisor(a, b);                                                               //Assigns the method return to a variable
        
        System.out.println("The Greatest Common Divisor of " + a + " and " + b + " is " + ComDiv);
    }
    
    public static int CommonDivisor(int a, int b)                                                       //Makes use of recursion and the Euclidean Algorith to find the GCD
    {
        if (b == 0)                                                                                     //If int b = 0 then a is the GCD of both numbers
        {
            return a;
        }
        else
        {
            return CommonDivisor(b, a % b);                                                             //Method calls itself, Divids a by b and checks the remainder
        }
    }
    
}
