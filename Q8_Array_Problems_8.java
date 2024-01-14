// Q.8) Java Program to print the elements of an array present in an odd position
public class Q8_Array_Problems_8 {
    public static void main(String args[])
    {
        // Creating an array 0f student id of kabbadi player
        int arr[] = {1911,1923,2319,1119,1919,2323,1111};

        // Printing an existing array 
        System.out.print("The Array : ");
            // using for loop 
            for(int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }

        // Printing an elements which is prenset on odd index
        System.out.print("\nElements at odd index : ");
            // using for loop
            for(int i=0; i<arr.length; i=i+2)
            {
                System.out.print(arr[i] + " ");
            }
    }
    
}
