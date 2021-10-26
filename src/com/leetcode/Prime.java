package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        n = sc.nextInt();
        primeTillN(n);
    }
    public static void primeTillN(int n){
        int count  = 0;
        System.out.println("cjjcc");
        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime,true);
        for(int i = 2; i * i < n ;i++){
                for(int j = i*2; j < n ; j += i){
                    isPrime[j] = false;
                }
        }
        for(int i = 0; i< n ;i++){
            if(isPrime[i] == true){
                if(i == 0 || i == 1) {
                    continue;
                }
                count++;
            }
        }
    }
}
