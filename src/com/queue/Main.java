package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String args[]){
        Queue queue = new LinkedList<Character>();
        Stack stack = new Stack<Character>();
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0;i < str.length(); i++){
            queue.add(str.charAt(i));
            stack.push(str.charAt(i));
        }

        while(!stack.isEmpty()){
            if(stack.pop() == queue.poll()){
                continue;
            }else{
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
