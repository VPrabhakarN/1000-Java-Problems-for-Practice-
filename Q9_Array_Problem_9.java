// Q.9) Java Program to print the largest element in an array

public class Q9_Array_Problem_9 {
    public static void main(String args[])
    {
        // Creating an array
        int arr[] = {3,5,7,8,11,19,23,14,12};

        // Printing an existing array 
        System.out.print("The Array : ");
           //using for loop 
           for(int i=0; i<arr.length; i++)
           {
            System.out.print(arr[i]+" ");
           }

        // Finding the largest element in array
        
        // initiate arr[0] in 'biggest'
        int biggest = arr[0];

        // using for loop 
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > biggest)
            {
                biggest=arr[i];
            }
        }
        System.out.print("\nThe Biggest element : "+biggest);
    }  
}
