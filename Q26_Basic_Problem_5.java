// Q.26) Factorial Program in Java

import java.util.Scanner;

public class Q26_Basic_Problem_5 {
    public static void main(String args[])
    {
        // Creating scanner instance
        Scanner sc = new Scanner(System.in);

        // Taking value from the user 
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int fact = 1;

        // using for loop 
        for(int i = 1; i<= num; i++)
        {
            fact = fact*i;
        }

        // Printing 'factorial' 
        System.out.print("Factorial : "+fact);
    }
}
