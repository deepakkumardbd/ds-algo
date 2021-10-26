package com.leetcode;

import java.util.Scanner;

public class sayHello {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        System.out.println(countAndSay(sc.nextInt()));
    }
    public static  String countAndSay(int n) {
        if( n == 1){
            return "1";
        }else if (n == 2){
            return "11";
        }else{
            return say(countAndSay(n-1));
        }
    }
    public static String say(String str){
        int count = 1;
        String returnVal ="";
        char ch1 = str.charAt(0);
        for(int i=1;i<str.length();i++){
            char ch2 = str.charAt(i);
            if(ch2 == ch1){
                count++;
            }else{
                returnVal = String.valueOf(count) + ch1 + returnVal;
                ch1 = ch2;
                count = 1;
            }
            if(i == str.length()-1){
                returnVal =  returnVal + count + ch1;
            }
        }
        return returnVal;
    }
}
