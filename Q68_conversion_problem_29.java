// Java program to Convert seconds into hours 

public class Q68_conversion_problem_29 {
    public static void main(String args[])
    {
        // Defining seconds 
        int secs = 19231923;
        System.out.println("Seconds : "+secs);

        // Conversion 
        float hrs = secs/60;
        hrs = hrs/60;
        System.out.println("Hours : "+hrs);
    }
}
