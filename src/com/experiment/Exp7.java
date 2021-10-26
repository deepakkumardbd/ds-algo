package com.experiment;

import java.util.ArrayList;

public class Exp7 {
    public static void main(String args[]){
        Exp7 exp7 = new Exp7();
        exp7.checkInclusion("abc", "abcde");
    }
        public boolean checkInclusion(String s1, String s2) {
            ArrayList<String> returnVal = new ArrayList<String>();
            printPermutation(s1,0,s1.length(), returnVal);

            for(int i = 0 ; i < returnVal.size(); i++){
                System.out.println(returnVal.get(i));
            }
            return true;
        }

        public void printPermutation(String s1, int init, int end, ArrayList<String> returnVal){
            if(init == end){
                returnVal.add(s1);
            }
            for(int i = init; i < end; i++){
                s1 = swap(s1, init, i);
                printPermutation(s1, init+1, end, returnVal);
                s1 = swap(s1, init, i);
            }
        }

        String swap(String str1, int i, int j){
            char ch[] = str1.toCharArray();
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            str1 = new String(ch);
            return str1;
        }
}
