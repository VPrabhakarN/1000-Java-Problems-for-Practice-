// Q.6) Java Program to print the duplicate elements of an array

public class Q6_Array_Problem_6 {
 public static void main(String args[])
 {
    // Creating an array
    int arr[] = {1,2,3,1,4,5,6,3,4,2};

    // Printing an array 
    System.out.print("The Array : ");
       // using for loop
       for(int i=0; i<arr.length; i++)
       {
        System.out.print(arr[i] + " ");
       }

    // Identifying the duplicate elements of an array 
    System.out.print("\nDuplicate element : ");
    
    // using for loop 
    for(int i=0; i<arr.length; i++)
    {
        // using for loop within for loop 
        for(int j = i+1; j<arr.length; j++)
        {
            if(arr[i] == arr[j])
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
 }   
}
