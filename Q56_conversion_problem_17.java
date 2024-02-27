// Java program to Convert String to boolean

public class Q56_conversion_problem_17 {
    public static void main(String args[])
    {
        // Defining string
        String str = "TRUE";
        System.out.println("String : "+str);
        
        // conversion
        boolean bool = Boolean.parseBoolean(str);
        System.out.println("Boolean : "+bool);
    }
}
