package com.dp;

import java.util.ArrayList;
import java.util.Scanner;

public class CanSum {
    public static void main(String args[]){
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the arrays");
        int arr[] = new int [n];
        for(int i = 0 ;i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the can sum");
        int sum = sc.nextInt();
        int boo[] = new int [sum+1];
        for(int i = 0 ;i < sum+1; i++){
            boo[i] = -1;
        }
//        System.out.println(cansum(sum,arr,0));
//        System.out.println(cansum(sum,arr));
        ArrayList <Integer> set = new ArrayList<Integer>();
        System.out.println(cansum(sum,arr,boo,set));
        for(int i : set){
            System.out.println(i);
        }
    }
    public static boolean cansum(int sum, int arr[], int pos){
        if(sum < 0){
            return false;
        }else if(pos >= arr.length){
            return false;
        }else if(sum == 0){
            return true;
        }else{
            return cansum(sum-arr[pos],arr,pos) || cansum(sum-arr[pos],arr,pos+1) || cansum(sum,arr,pos+1);
        }
    }
    public static boolean cansum(int sum, int arr[]){
        boolean b = false;
        if(sum < 0){
            return false;
        }else if(sum == 0){
            return true;
        }
        for(int i = 0;i<arr.length; i++){
            b = b || cansum(sum - arr[i],arr);
        }
        return b;
    }
    public static boolean cansum(int sum, int arr[], int val[], ArrayList<Integer> set){
        if(sum < 0){
            return false;
        }
        if(sum == 0 ){
            val [sum] = 1;
        }else if( val [sum] != -1){
            return  val[sum] == 1 ? true : false;
        }else{
            boolean b = false;
            for(int i =0 ;i< arr.length; i++){
                b = b || cansum(sum - arr[i],arr,val,set);
                if(b == true){
                    set.add(arr[i]);
                    break;
                }
            }
            val [sum] = b == true ? 1 : 0;
        }
        return val[sum] == 1 ? true : false;
    }
}
