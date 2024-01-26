/*  Q.29) Number-increasing Pyramid Pattern 
           1
           22
           333
           4444
           55555
           666666
*/
// java program to print 'Number-increasing Pyramid Pattern'

public class Q31_Pattern_3 {
    public static void main(String args[])
    {
        // defining 3 variables
        int i, j, n=6;

        // Using nested for loop

        // 1st for loop for rows
        for(i=1; i<=n; i++)
        {
            // 2nd for loop for columns 
            for(j=0; j<=i-1; j++)
            {
                System.out.print(i);
            }

            // Using for loop 
            for(j=i+1; j<=n; j++);
            {
                System.out.print(" ");
            }
        System.out.println();
        }
    }
}
