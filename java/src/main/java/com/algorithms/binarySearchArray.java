package com.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchArray {

    public static boolean binarySearch(int [] arr, int target){
         int min = 0;
         int max = arr.length - 1;
         while(min <= max){
            int mid = (min + max)/2;
            if(target == arr[mid]){
                return true;
            }else if(target < arr[mid]){
                max = mid -1;
            }
            else{
                min = mid +1;
            }
         }
         return false;
        }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt(); 
        int[] arr = new int[n]; // Initialize the array with size n
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array Elements:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " \n");
        }
        System.out.println("Enter the element to search:");
        int target = scanner.nextInt();
     System.out.println(binarySearch(arr, target)); 
     System.out.println(Arrays.binarySearch(arr,target));
     scanner.close();
    }

}
