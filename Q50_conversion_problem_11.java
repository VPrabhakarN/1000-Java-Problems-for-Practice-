// Java program to Convert String to Date

import java.util.Date;
import java.text.SimpleDateFormat;

public class Q50_conversion_problem_11 {
    public static void main(String args[]) throws Exception{
        // Defining string 
        String date = "23/08/2002";
        System.out.println("String date : "+date);

        // conversion 
        Date date1 = new SimpleDateFormat("dd/mm/yyyy").parse(date);
        System.out.println("Date : "+date1);
    }
}
