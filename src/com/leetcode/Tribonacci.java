package com.leetcode;

import java.util.Scanner;

public class Tribonacci {
    static long count = 0;
    public static void main(String args[]){
        System.out.println("Enter the number of numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tribonacci(n));
        System.out.println(count);
    }
    public static int tribonacci(int n) {
        count++;
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }else{
            return (tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3));
        }
    }
}
