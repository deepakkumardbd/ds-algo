package com.dp;

import java.util.Scanner;

public class CanConstruct {
    public static void main(String args[]){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be constructed");
        str = sc.nextLine();
        System.out.println("Enter the number of elements in the array");
        int n = Integer.parseInt(sc.nextLine());
        String arr [] = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        System.out.println(recurCan(str,arr,0));
    }

    public static boolean recurCan(String str, String arr[], int init){
        boolean returnVal = false;
        int posMatched = -1;
        if(str.length() == init){
            return true;
        }
        for(int i =0; i < arr.length ; i++){
            posMatched = match(str,arr[i],init);
            if(posMatched != -1){
                returnVal = returnVal || recurCan(str, arr, posMatched);
            }
        }
        return  returnVal;
    }

    public static int match(String str,String arr, int init){
        int position = -1;
        int i = init;
        int k = 0;
        while(i < str.length() && k < arr.length()){
            if(arr.charAt(k) == str.charAt(i)){
                position = k+1;
                i++;
                k++;
                continue;
            }else{
                break;
            }
        }
        if(position == arr.length()){
            return i;
        }else{
            return -1;
        }
    }
}

