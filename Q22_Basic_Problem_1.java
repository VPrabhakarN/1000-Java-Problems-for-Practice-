// Q.22) Fibonacci Series in Java

public class Q22_Basic_Problem_1 
{
    public static void main(String args[])
    {
        // Printing fibancci series 0-10
        int i, num = 0, num2 = 1;
        int num3;

        System.out.print("The Fibanacci Series : ");

        // Using for loop 
        for(i=0; i<=10; i++)
        {
            System.out.print(num + " ");
            num3 = num + num2;
            num = num2;
            num2 = num3;
        }
    }
}