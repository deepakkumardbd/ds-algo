package com.leetcode;

import java.util.Scanner;

public class BalancedParenthesis {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        n = sc.nextInt();
        char ch[] = new char[2*n];
        printParenthesis(ch,n,0,0,0);

    }
    static void printParenthesis(char ch[], int n, int pos, int left , int right){
        if(pos == 2*n){
            for(int i = 0; i < 2*n ; i++){
                System.out.print(ch[i]);
            }
            System.out.println();
        }else{
            if(left < n){
                ch[pos] = '{';
                printParenthesis(ch,n,pos+1,left+1,right);
            }
            if(right < left){
                ch[pos] = '}';
                printParenthesis(ch,n,pos+1,left,right+1);
            }
        }
    }
}
