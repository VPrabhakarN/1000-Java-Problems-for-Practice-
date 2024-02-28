// Java program to Convert String to String array in Java

public class Q62_conversion_problem_23 {
    public static void main(String args[])
    {
        // Defining string 
        String str = "Vijay Prabhakar Nagane";
        System.out.println("String : "+str);

        // defining an array to store all the characters into it
        char[] ch = new char[str.length()];

        // conversion 
        for(int i=0; i<str.length(); i++)
        {
            ch[i] = str.charAt(i);
        }

        System.out.print("The Array : ");
        for(int i=0; i<ch.length; i++)
        {
            System.out.print(ch[i]+" ");
        }
    }
}
