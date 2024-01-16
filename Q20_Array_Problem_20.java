// Q.20) Java Program to Find the Smallest Number in an array

public class Q20_Array_Problem_20 {
    public static void main(String args[])
    {
        // Creating an array 
        int arr[] = {19,18,10,11,17,16,12,13,15,9,5,20};

        // Printing an existing array 
        System.out.print("The array : ");
           // Using for loop 
           for(int i=0; i<arr.length; i++)
           {
            System.out.print(arr[i]+" ");
           }

        // Finding the smallest number in an array 
        int smallest = arr[0];

        // Using for loop 
        for(int i=0; i<arr.length; i++)
        {
            // Using another for loop 
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    smallest=arr[i];
                }
            }
        }

        // Printing the Smallest Number in an array
        System.out.print("\nThe Smallest Number in an array : "+smallest);
    }
}