/*  Q.32) Number-increasing reverse Pyramid Pattern 
         123456
         12345
         1234
         123
         12
         1
*/

public class Q32_Pattern_4 {
    public static void main(String args[])
    {
        // defining 3 variables
        int i, j, n=6;

        // Using nested loop 

        // 1st for loop for number of rows
        for(i=n; i>=1; i--)
        {
            // 2nd for loop for number of columns
            for(j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
