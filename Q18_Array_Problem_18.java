// Q.18) Java Program to Find the Largest Number in an array

public class Q18_Array_Problem_18 {
    public static void main(String args[])
    {
        // Creating an array
        int arr[] = {11,15,78,12,23,19,22,34,56,77,99,18};

        // Printing an existing array 
        System.out.print("The array : ");
           // Using for loop 
           for(int i=0; i<arr.length; i++)
           {
            System.out.print(arr[i]+" ");
           }

        // Finding the largest number 
        int largest = arr[0];

        // using for loop 
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }

        // Printing largest number in an array 
        System.out.print("\nThe largest number : "+largest);
    }
}
