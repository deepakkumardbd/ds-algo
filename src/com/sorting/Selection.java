package com.sorting;

import java.util.Scanner;

public class Selection {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers :");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter all the numbers");
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        arr = selection(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] selection(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int max = arr[0];
            for(int j = 1; j < arr.length-i; j++) {
                if (max < arr[j]) {
                    int temp = max;
                    max = arr[j];
                    arr[j] = temp;
                }
            }
            int temp1 = arr[arr.length-i-1];
            arr[arr.length-i-1] = max;
            arr[0] = temp1;
        }
        return arr;
    }
}
