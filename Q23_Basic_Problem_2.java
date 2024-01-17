// Q.23) Prime Number Program in Java

import java.util.*; 
public class Q23_Basic_Problem_2 {
    public static void main(String args[])
    {
        //create an instance for scanner class
        Scanner sc = new Scanner (System.in);
        int n, i, m=0, flog=0;
        
        //taking input from the user 
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        m = n/10;

        //using for loop
        for(i=2; i<=m; i++)
        {
            if(n%i == 0)
            {
                System.out.println("This is not prime number");
                flog=1;
                break;
            }
            if(flog == 0)
            {
                System.out.println("This is prime!");
            }
        }
    }
    
}

