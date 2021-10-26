package com.sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers :");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter all the numbers");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        mergesort(arr,0,arr.length-1);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergesort(int arr[],int l,int h){
        if(l<h) {
            int m1 = (l+h)/2;
            mergesort(arr,l,m1);
            mergesort(arr,m1+1,h);
            merge(arr,l,m1,h);
        }
    }
    public static void merge(int arr[], int l, int m, int h) {
        int temp[]=new int[h-l+1];
        int i=l;
        int j = m+1;
        int k=0;
        while (i <= m && j <= h) {
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=h){
            temp[k++] = arr[j++];
        }

        k = 0;
        for(int it = l; it<=h;it++){
            arr[it] = temp[k++];
        }
    }
}
