// Q.19) Java to Program Find 2nd Smallest Number in an array

public class Q19_Array_Problem_19 {
    public static void main(String args[])
    {
        // Creating an array 
        int arr[] = {10,9,6,8,3,11,23,34,5,71,9,0,18};

        // Printing an existing array 
        System.out.print("The array : ");
           // Using for loop 
           for(int i=0; i<arr.length; i++)
           {
            System.out.print(arr[i]+" ");
           }

        // Sorting array in ascending order 
        int temp = 0;

        // using for loop 
        for(int i=0; i<arr.length; i++)
        {
            // Using another for loop 
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Printing 2nd Smallest Number in an array
        System.out.print("\nThe 2nd Smallest Number in an array : "+arr[1]);
    }
}
