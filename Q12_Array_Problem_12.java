// Q.12) Java Program to print the sum of all the items of the array 

public class Q12_Array_Problem_12 {
    public static void main(String args[])
    {
        // creating an array 
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};

        // Displaying an array 
        System.out.print("The array : ");
            // using for loop 
            for(int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }

        // define a variable as 'sum'
        int sum = 0;
        
        // calculating sum of all the items in the array 
        // using for loop 
        for(int i=0; i<arr.length; i++)
        {
            sum = sum+arr[i];
        }

        // displaying the sum of the items
        System.out.print("\nThe sum of all items of the array : "+sum);
    }
}
