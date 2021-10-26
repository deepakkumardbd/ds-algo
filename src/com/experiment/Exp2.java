package com.experiment;

public class Exp2 {
    public static void main(String args[]){
        String str = "Deepak";
        int i = 0;
        int j = 5;
        swap(str,i,j);
//        System.out.println(swap(str,i,j));
//        System.out.println(str);
        print();
    }
    public static String swap(String str, int i, int j){
        char [] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }

    public static void print() {
        String s = "abcd";
        for (float pivot = 0; pivot < s.length(); pivot += .5) {

            // set radius to the first nearest
            // element on left and right
            float palindromeRadius = pivot - (int) pivot;
            System.out.println(palindromeRadius);
        }
    }
}
