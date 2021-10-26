package com.experiment;

import java.util.Scanner;

public class Solution2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
//        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        String arr [] = { "new","news","aNy","ShoGun","New","USA"};
        Solution2 sol = new Solution2();
        sol.validWords(arr);
    }

    public void validWords(String arr[]){
        for(int i= 0; i< arr.length; i++){
            if(valid(arr[i])){
                System.out.println("Valid");
            }else{
                System.out.println("Not valid");
            }
        }
    }

    public boolean valid(String s){
        for(int i = 0 ; i< s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                continue;
            }else{
                return false;
            }
        }

        if(Character.isUpperCase(s.charAt(0))){
            int count = 1;
            for(int i= 1; i<s.length(); i++){
                if(Character.isUpperCase(s.charAt(i))){
                    count++;
                }
            }
            if(count == 1 || count == s.length()){
                return true;
            }else{
                return false;
            }
        }else{
            int count = 1;
            for(int i= 1; i<s.length(); i++){
                if(Character.isLowerCase(s.charAt(i))){
                    count++;
                }
            }
            if(count == s.length()){
                return true;
            }else{
                return false;
            }
        }
    }

}
