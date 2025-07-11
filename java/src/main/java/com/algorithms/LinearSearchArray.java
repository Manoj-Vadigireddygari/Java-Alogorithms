package com.algorithms;


import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class LinearSearchArray {

    public static boolean linearSearch(int[] arr,int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    public static OptionalInt linearSearchUsingStreams(int[] arr, int target){
        return Arrays.stream(arr).filter(x -> x == target).findFirst();
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

        System.out.println(linearSearch(arr, target));
        linearSearchUsingStreams(arr, target).ifPresent(System.out::println);
    }
}           