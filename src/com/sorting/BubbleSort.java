package com.sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers :");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter all the numbers");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        arr = bubble(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] bubble(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j = 0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
