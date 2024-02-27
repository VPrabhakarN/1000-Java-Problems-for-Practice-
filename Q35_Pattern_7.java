/* Q.35) Palindrome Triangle Pattern

          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6 

 */

// Java program to print 'Palindrome Triangle Pattern'
public class Q35_Pattern_7 {
    public static void main(String args[])
    {
        int i, j, n=6;

        // first for loop 
        for(i=1; i<=n; i++)
        {
            // for loop for spaces 
            for(j=1; j<= 2*(n-i); j++)
            {
                System.out.print(" ");
            }

            // for loop to print first part 
            for(j=i; j>=1; j--)
            {
                System.out.print(j+" ");
            }

            // for loop to print second part 
            for(j=2; j<=i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
