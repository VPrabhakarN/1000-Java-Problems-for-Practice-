// Q.27) How to Generate Random Numbers in Java
// Generating random 'int'

import java.util.Random;

public class Q27_Basic_Problem_6 {
    public static void main(String args[])
    {
        // create instance for random class 
        Random sc = new Random();

        // generating random int between 0-100
        int num1 = sc.nextInt(100);

        // generating random int between 0-200
        int num2 = sc.nextInt(200);

        // generating random int between 0-300
        int num3 = sc.nextInt(300); 
        
        // Printing random values 
        System.out.print(" 1st Random Number : "+num1);
        System.out.print("\n 2nd Random Number : "+num2);
        System.out.print("\n 2nd Random Number : "+num3);
    }
}
