/* Q33) Number-changing Pyramid Pattern

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21

*/

// Java program to print 'Number-changing Pyramid Pattern'
public class Q33_Pattern_5 {
    public static void main(String args[])
    {
        int i, j, n = 6, num = 1;

        // Fisrt for loop for number of colom 
        for(i=0; i<n; i++)
        {
            // another for loop for number of rows
            for(j=0; j<=i; j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}