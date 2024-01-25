/*  Q.29) Square Hollow Pattern
           ******
           *    *
           *    *
           *    *
           *    *
           ******
*/

// Java program to print 'Square Hollow Pattern'
import java.util.*;
public class Q29_Pattern_1 
{
    public static void main(String args[])
    {
        // Define two variables 
        int i,j, n=6;

        // Using nested for loop

        // 1st for loop for rows 
        for(i=0; i<n; i++)
        {
            // 2nd for loop for columns
            for(j=0; j<n; j++)
            {
                // Using if else statement 
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1 )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}