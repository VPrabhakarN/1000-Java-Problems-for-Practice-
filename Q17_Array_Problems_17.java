// Q.17) Java Program to Find 2nd Largest Number in an array 

public class Q17_Array_Problems_17 {
    public static void main(String args[])
    {
        // Creating an array 
        int arr[] = {12,9,7,8,10,3,13,6,2,5,4,14,10,1,11};

        // Printing an existing array
        System.out.print("The array : ");
           // Using for loop 
           for(int i=0; i<arr.length; i++)
           {
            System.out.print(arr[i]+" ");
           }

        // sorting array in descending order 
        int temp = 0;

        // using for loop 
        for(int i=0; i<arr.length; i++)
        {
            // using another for loop 
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Printing 2nd Largest Number in an array 
        System.out.print("\nThe 2nd Largest Number in an array : "+arr[1]);
    }
}
