/*  Q.30) Number triangle Pattern
              1 
             22 
            333
           4444
          55555
*/
 // Java program to print 'Number triangle Pattern'
public class Q30_Pattern_2 {
    public static void main(String args[])
    {
        // define two variables and thid with value 
        int i,j, n = 5;

        // Using nested for loop 

        // 1st for loop for rows
        for(i = 1; i<=n; i++)
        {
            // 2nd for loop 
            for(j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            
            // Another for loop 
            for(j=1; j<=i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
