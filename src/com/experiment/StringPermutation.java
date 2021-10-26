package com.experiment;


import java.util.*;
import java.lang.*;

public class StringPermutation {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = Integer.parseInt(sc.nextLine());
            for(int i= 0; i < t; i++){
                String s = sc.nextLine();
                System.out.println(s);
                permute(s,0,s.length()-1);
                System.out.println();
            }
        }
        public static void permute(String str,int init, int end){
            if(init == end){
                System.out.print(str+" ");
                return;
            }
            for(int i = init; i <= end; i++){
                permute(swap(str,init,i),init+1,end);
            }
        }
        public static String swap(String str, int i, int j){
            char [] ch = str.toCharArray();
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            return new String(ch);
        }
}
