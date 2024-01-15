// Q.15) Java Program to sort the elements of an array in descending order
public class Q15_Arrat_Problem_15 {
    public static void main(String args[])
    {
        // Creating an array 
        int arr[] = {13,11,10,12,8,9,7,5,3,4,2,6,1,14};

        // Printng array before descending order 
        System.out.print("The array before decending order : ");
            // using for loop 
            for(int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }

        // sorting array 
        int temp = 0;
        
        // usimg for loop 
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

        // Printng array after descending order
        System.out.print("\n The array after decending order : ");
             // using for loop
             for(int i=0; i<arr.length; i++)
             {
                System.out.print(arr[i]+" ");
             }
    }  
}
