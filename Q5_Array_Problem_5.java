// Q.5) Java Program to print the elements of an array in reverse order

public class Q5_Array_Problem_5 {
    public static void main(String args[])
    {
        // creating an array 
        int arr[] = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};

        // Printing array 
        System.out.print("The existing array : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        // Printing array in reverse order
        System.out.print("\nThe reverse array  : ");
        for(int i = arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }    
}
