// Q.4) Java Program to print the elements of an array

public class Q4_Array_Problem_4 {
    public static void main(String args[])
    {
        // creating an array of names of kabbadi team
        String arr[] = {"Rohan,","Vijay,","Aman,", "Sidharth,", "Vaibhav,", "Pratik,", "Lajam"};

        // displaying an array 
        System.out.print("Kabbadi Team : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    } 
}
