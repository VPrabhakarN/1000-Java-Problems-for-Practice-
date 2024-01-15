// Q.16) Java Program to Find 3rd Largest Number in an array

public class Q16_Array_Problem_16 {
    public static void main(String args[])
    {
        // Creating an array 
        int arr[] = {12,13,11,9,8,10,5,6,7,3,2,4,1,15};

        // Printing existing array 
        System.out.print("The array : ");
           // using for loop 
           for(int i=0; i<arr.length; i++)
           {
            System.out.print(arr[i]+" ");
           }

        // sorting array in descending order 
        int temp = 0;

        // using for loop 
        for(int i=0; i<arr.length; i++)
        {
            // using loop within loop 
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

        // printing 3rd largest number in an array
        System.out.print("\nThe 3rd largest number in array is "+arr[2]);
    }
}
