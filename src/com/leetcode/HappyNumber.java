package com.leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        n = sc.nextInt();
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        boolean resultValue = false;
        int sum;
        Set<Integer> set = new HashSet<Integer>();
        do{
            sum = 0;
            while(n>0){
                int rem = n%10;
                n = n/10;
                sum = sum + rem*rem;
            }
            n = sum;
            if(n == 1){
                break;
            }
            else if(!set.contains(n)){
                set.add(n);
            }else{
                return false;
            }
        }while(sum > 1);
        return true;
    }
}
