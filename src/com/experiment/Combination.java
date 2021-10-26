package com.experiment;

import java.util.Scanner;

public class Combination {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n , r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int data[] = new int[r];
        int arr[] = new int[n];
        int index = 0 ;

        System.out.println("Enter n numbers");
        for(int i= 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        printCombination(arr,data,n,r,index,i);
    }
    public static void printCombination(int arr[], int data[], int n, int r, int index, int i){
        if(index == r){
            for(int k = 0;k < r ; k++){
                System.out.print(data[k]);
            }
            System.out.println();
            return;
        }
        if( i >= n){
            return;
        }
        data[index] = arr[i];
        printCombination(arr,data,n,r,index+1,i+1);
        printCombination(arr,data,n,r,index,i+1);
    }
}
