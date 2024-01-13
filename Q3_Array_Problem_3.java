// Q.3) Java Program to left rotate the elements of an array
public class Q3_Array_Problem_3 {
    public static void main(String args[])
    {
        // creating an array 
        int arr[] = {1,2,3,4,5};
          
           // creating another array 
           int arr1[] = new int[arr.length];

           // using for loop to print existing array
           System.out.print("The existing array : ");
           for(int i = 0; i<arr.length; i++)
           {
            System.out.print(arr[i] + " ");
           }

           // determine how many times you have to rotate array 
           int n = 3; // 3 times 

           // using for loop 
           for(int i=0; i<n; i++)
           {
            int first, j;
            first = arr[0];

            // using another for loop 
            for(j=0; j<arr.length-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[j] = first;
           }

           // using for loop to print rotating array 
           System.out.print("\nAfter rotation Array : ");
           for(int i=0; i<arr.length; i++)
           {
             System.out.print(arr[i] + " ");
           }
        }
    
}
