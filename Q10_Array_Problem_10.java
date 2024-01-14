// Q10.) Java Program to print the smallest element in an array

public class Q10_Array_Problem_10 {
    public static void main(String args[])
    {
        // Creating an array 
        int arr[] = {13,3,5,7,11,19,23,30,27};

        //Printing an existance array 
        System.out.print("The array : ");
           // using for loop 
           for(int i=0; i<arr.length; i++)
           {
            System.out.print(arr[i]+" ");
           }

        // initiate arr[0] in 'smallest'
        int smallest = arr[0];
        
        //using for loop 
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.print("\nThe smallest number : "+smallest);
    }    
}
