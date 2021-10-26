package com.stack;

import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        LinkedList list = new LinkedList<Character>();
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0; i < str.length()/2;i++){
            list.push(str.charAt(i));
        }
        for(int i = (str.length()/2)+1; i < str.length();i++){
            if(list.pop().equals(str.charAt(i))){
                continue;
            }else{
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
