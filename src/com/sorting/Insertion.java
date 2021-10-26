package com.sorting;

import java.util.Scanner;

public class Insertion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers :");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter all the numbers");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        arr = insertion(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] insertion(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int val = arr[i];
            int pos = i;
            for(int j = i-1; j >= 0; j--){
                if(val < arr[j]){
                    arr[pos--] = arr[j];
                }else{
                    break;
                }
            }
            arr[pos] = val;
        }
        return arr;
    }
}
