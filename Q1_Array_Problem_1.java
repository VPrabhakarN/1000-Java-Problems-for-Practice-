// Q.1) Java Program to copy all elements of one array into another array 

import java.util.Scanner;

public class Q1_Array_Problem_1
{
    public static void main(String args[])
    { 
        // creating an array 
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        // creating newarr
        int newarr[] = new int[10];

        // copying newarr from arr
        newarr = arr;

        // displaying an array 
        System.out.print("The existing array : ");
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");

        }
        System.out.println(" ");

        // displaying copied array 
        System.out.print("The Copied array : ");
        for(int i = 0; i<newarr.length; i++)
        {
            System.out.print(newarr[i] + " ");
        }
    }

}