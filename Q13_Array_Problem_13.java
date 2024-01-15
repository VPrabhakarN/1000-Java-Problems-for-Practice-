// Q.13) Java Program to right rotate the elements of an array

public class Q13_Array_Problem_13 {
    public static void main(String args[])
    {
        // Creating an array 
        int arr[] = {12,11,10,9,8,7,6,5,4,3,2,1};

        // Displaying an array 
        System.out.print("The array : ");
            // using for loop
            for(int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }

        // determine how many times you have to rotate array 
        int n = 3;

        // using for loop 
        for(int i=0; i<n; i++)
        {
            int last,j;
            last = arr[arr.length-1];

            // using another foor loop 
             for(j=arr.length-1; j>0; j--)
             {
                arr[j] = arr[j-1];
             }
             arr[0] = last;
        }
        
        // Printing rotated array
        System.out.print("\nThe rotated array : ");
             // Using for loop 
             for(int i=0; i<arr.length; i++)
             {
                System.out.print(arr[i]+" ");
             }
    }    
}
