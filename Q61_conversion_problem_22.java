// Java program to convert byte array to String in Java

public class Q61_conversion_problem_22{
    public static void main(String args[])
    {
        // Defining byte array
        byte[] vt = {1,2,3,4,5};
        System.out.print("The byte array : ");
        for(int i=0; i<vt.length; i++)
        {
            System.out.print(vt[i]+" ");
        }

        // conversion 
        String str = new String(vt);
        System.out.println("\nString : "+str);
    }
}