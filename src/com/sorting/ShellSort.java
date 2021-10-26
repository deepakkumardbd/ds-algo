package com.sorting;

import java.util.Scanner;

public class ShellSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers :");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter all the numbers");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        arr = shell(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] shell(int arr[]){
        int gap = arr.length/2;
        while(gap>0){
            for(int i=gap;i<arr.length;i++){
                int val = arr[i];
                int pos = i;
                for(int j=i-gap; j>=0; j--){
                    if(val < arr[j]){
                        arr[pos] = arr[j];
                        pos-=gap;
                    }else{
                        break;
                    }
                }
                arr[pos] = val;
            }
            gap = gap/2;
        }
        return arr;
    }
}
