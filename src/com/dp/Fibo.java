package com.dp;

import java.util.Scanner;

public class Fibo {
    static long a = 0;
    static long b = 0;
    public static void main(String args[]){
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recur(n));
        //Dynamic call
        {
            long arr[] = new long[n];
            for(int i = 0 ; i < n; i++){
                arr[i] = -1;
            }
            System.out.println(dpcalculate(n,arr));
        }
        System.out.println("a :"+a+" b :"+b);
    }
    public static long recur(int n){
        a++;
        if(n == 1 || n == 2){
            return 1;
        }else{
            return recur(n-1) + recur(n-2);
        }
    }
    public static long dpcalculate(int n, long arr[]){
        b++;
        if(arr[n-1] != -1){
            return arr [n-1];
        }else if(n == 1 || n== 2){
            arr[n-1] = 1;
        }else{
            arr[n-1] = dpcalculate(n-1,arr) + dpcalculate(n-2,arr);
        }
        return arr[n-1];
    }
}
