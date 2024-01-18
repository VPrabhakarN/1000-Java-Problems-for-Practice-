//How to Generate Random Numbers in Java
// Generating random 'float' 

import java.util.Random;

public class Q28_Basic_Problem_7 {
    public static void main(String args[])
    {
        // creating instance for random class
        Random sc = new Random();

        // generating random float 
        float num1 = sc.nextFloat();

        // generating random float 
        float num2 = sc.nextFloat();

        // generating random float 
        float num3 = sc.nextFloat();
       
        // Printing random values 
        System.out.print(" 1st Random Number : "+num1);
        System.out.print("\n 2nd Random Number : "+num2);
        System.out.print("\n 2nd Random Number : "+num3);
    }
}
