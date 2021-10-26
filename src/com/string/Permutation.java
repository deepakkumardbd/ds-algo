package com.string;

import java.util.Scanner;


public class Permutation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        printPerm(str,0,str.length()-1);
    }

    public static void printPerm(String str, int init, int end){
        if(init == end){
            System.out.println(str);
            return;
        }
        for(int i =init; i< str.length();i++){
            str = swap(str,init,i);
            printPerm(str,i+1,end);
//            str = swap(str,init,i);
        }
    }

    public static String swap(String str1, int i, int j){
        char temp[] = str1.toCharArray();
        char charTomove = temp[i];
        temp[i] = temp[j];
        temp[j] = temp[i];
        return String.valueOf(temp);
    }
}
