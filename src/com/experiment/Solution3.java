package com.experiment;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers :");
        int n = sc.nextInt();
        int arr1[]= new int[n];
        System.out.println("Enter all the numbers");
        for(int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of numbers in second array:");
        n = sc.nextInt();
        int arr2[]= new int[n];
        System.out.println("Enter all the numbers");
        for(int i = 0; i<n; i++){
            arr2[i] = sc.nextInt();
        }

        Solution3 sol = new Solution3();
        int arr3[] =  sol.merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));
    }

    public int[] merge(int arr1[], int arr2[]) {
        int h1 = arr1.length;
        int h2 = arr2.length;
        int temp[]=new int[h2+h1];
        int i=0;
        int j = 0;
        int k=0;
        while (i < h1 && j < h2) {
            if(arr1[i]<= arr2[j]){
                temp[k++] = arr1[i++];
            }else{
                temp[k++] = arr2[j++];
            }
        }
        while(i < h1){
            temp[k++]=arr1[i++];
        }
        while(j < h2){
            temp[k++] = arr2[j++];
        }
        return temp;
    }
}
