// Q.7) Java Program to print the elements of an array present on an even position

public class Q7_Array_Problem_7 {
    public static void main(String args[])
    {
        // creating an array of student id of kabbadi player
        int arr[] = {1911,1923,2319,1119,1919,2323,1111};

        // Printng an existing array 
        System.out.print("The array : ");
            //using for loop 
            for(int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }

        // Printing an elements which is prenset on even index 
        System.out.print("\nElements at even index : ");
        for(int i=1; i<arr.length; i = i+2)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
