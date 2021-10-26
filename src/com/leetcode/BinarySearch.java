package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for(int i = 0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("Eneter the number to be found");
        int num = sc.nextInt();
        System.out.println(binary(arr,num));
        System.out.println(binRecur(arr,0,arr.length,num));
    }
    static int binary(int arr[], int element){
        int pos = -1;
        int l,mid,h;
        l = 0;
        h = arr.length-1;
        while(l<=h){
            mid = (l+h)/2;
            if(arr[mid] == element){
                pos = mid;
                break;
            }else if(arr[mid] < element){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return pos;
    }

    static int binRecur(int arr[],int l, int h, int val){
        int mid = l+h/2;
        if(l>h){
            return -1;
        }
        if(arr[mid] == val){
            return mid;
        }else if(arr[mid] < val){
            return binRecur(arr,mid+1,h,val);
        }else{
            return binRecur(arr,l,mid-1,val);
        }
    }
}
