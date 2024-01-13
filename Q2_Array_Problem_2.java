// Q.2) Java Program to find the frequency of each element in the array

public class Q2_Array_Problem_2 {
    public static void main(String args[])
    {
        // creating an array 
        int arr[] = {1,1,3,4};
        int arr1[] = new int[arr.length];

        // identifying the frequency of the element in array

        int visited = -1;

        //using for loop 
        for(int i=0; i<arr.length; i++)
        {
            int count=1;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    arr1[j]=1;
                }
            }
            if(arr1[i] != visited)
            {
                arr1[i] = count;
            }
        }

        // using for loop
        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i] != visited)
            {
                System.out.println(arr[i] + " " + arr1[i]);
            }
        }
    }
}
