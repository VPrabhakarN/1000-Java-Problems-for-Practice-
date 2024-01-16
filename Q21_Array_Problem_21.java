// Q.21)  java Program to Remove Duplicate numbers in an array

public class Q21_Array_Problem_21 {
    public static void main(String args[])
    {
        // Creating an array 
        int arr[] = {12,9,10,4,23,29,27,14,22,8,1,9,19,27,23};

        // Printing an existing array 
        System.out.print("The array : ");
           // Using for loop
           for(int i=0; i<arr.length; i++)
           {
            System.out.print(arr[i]+" ");
           }

        // Finding the dublicate numbers in an array 
        
        // using for loop 
        for(int i=0; i<arr.length; i++)
        {
            // Using another for loop 
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.print("\nDuplicate element : "+arr[i]);
                }
            }
        }
    }
}
