package com.leetcode;

import java.util.Scanner;

public class SortedVowel {
    static int numberOfIteration = 0;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        sum = count(n , 'a') + count(n , 'e') + count(n , 'i') + count(n, 'o') + count(n, 'u');
        System.out.println(sum);
        System.out.println(numberOfIteration);
    }
    public static int count(int n, char ch){
        numberOfIteration++;
        int sum = 0;
        if(n==1){
            return 1;
        }else {
            if (ch == 'a') {
                sum = count(n - 1, 'a') + count(n - 1, 'e') + count(n - 1, 'i') + count(n - 1, 'o') + count(n - 1, 'u');
            } else if (ch == 'e') {
                sum = count(n - 1, 'e') + count(n - 1, 'i') + count(n - 1, 'o') + count(n - 1, 'u');
            } else if (ch == 'i') {
                sum = count(n - 1, 'i') + count(n - 1, 'o') + count(n - 1, 'u');
            } else if (ch == 'o') {
                sum = count(n - 1, 'o') + count(n - 1, 'u');
            } else {
                sum = count(n - 1, 'u');
            }
        }
        return sum;
    }
}
