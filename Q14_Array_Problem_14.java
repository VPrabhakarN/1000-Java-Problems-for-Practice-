// Q.14) Java Program to sort the elements of an array in ascending order
public class Q14_Array_Problem_14 {
    public static void main(String args[])
    {
        // Creating an array 
        int arr[] = {13,11,12,9,10,2,1,3,6,5,7,4,8};

        // Printng array before ascending
        System.out.print("The array before ascending : ");
            // using for loop 
            for(int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }
            
        // sorting an array 
        int temp =0;
        // using for loop 
        for(int i=0; i<arr.length; i++)
        {
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

        // Printng array after ascending 
        System.out.print("\nThe array after decending  : ");
        // using for loop
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
