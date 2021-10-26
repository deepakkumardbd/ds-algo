package com.string;

import java.util.Scanner;

public class Subsequence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        printSubsequence(str,"");
    }

    public static void printSubsequence(String str1, String str2){
        if(str1.length() == 0){
            System.out.print(str2+" ");
            return;
        }else{
            printSubsequence(str1.substring(1),str2);
            printSubsequence(str1.substring(1),str2+str1.charAt(0));
        }
    }
}
