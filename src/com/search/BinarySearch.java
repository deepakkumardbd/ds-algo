package com.search;

import java.util.Scanner;

public class BinarySearch {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int val = sc.nextInt();
        binarySearch(arr, val,0,arr.length-1);
        bin(arr, val,0,arr.length-1);
    }

    public static void binarySearch(int arr[], int val, int l, int u) {

        if (l <= u) {
            int mid = (l + u) / 2;
            if (val < arr[mid]) {
                binarySearch(arr, val, l, mid-1);
            } else if (val > arr[mid]) {
                binarySearch(arr, val, mid + 1, u);
            } else {
                System.out.println("Found out at: " + mid + " position");
                return;
            }
        }
    }

    public static void bin(int arr[], int val ,int l,int u){
        while(l<=u){
            int mid = (l+u)/2;
            if(arr[mid] == val){
                System.out.println("Found at "+ mid + " position.");
                break;
            }else if(arr[mid] < val){
                l = mid+1;
            }else{
                u = mid-1;
            }
        }
    }
}