package com.string;

import java.util.Arrays;

public class LongestRepeatingCharacter {
    public static void main(String args[]){
        String s = "AABABBA";
        int k = 1;
        LongestRepeatingCharacter ls = new LongestRepeatingCharacter();
        System.out.println(ls.characterReplacement(s,k));
    }
    public int characterReplacement(String s, int k) {
        int chs[] = new int[26];
        int maxForAllChar = 0;
        for(char ch = 'A'; ch <= 'Z';ch++){
            Arrays.fill(chs, 0);
            chs[s.charAt(0)-'A'] = 1;
            int maxSize = 1;
            int init = 0;
            int end = 0;
            int k_tillNow;
            if(ch == s.charAt(0)){
                k_tillNow = 0;
            }else{
                k_tillNow = 1;
            }
            for(int i = 1 ;i < s.length(); i++){
                if(s.charAt(i) == ch){
                    chs[s.charAt(i)-'A']++;
                    end++;
                }else{
                    chs[s.charAt(i)-'A']++;
                    k_tillNow = k_tillNow + 1;
                    end++;
                }
                while(!valid(chs, k, ch)){
                    chs[s.charAt(init)-'A']--;
                    if(s.charAt(init) != ch){
                        k_tillNow = k_tillNow - 1;
                    }
                    init++;
                }

                if(end - init + 1 > maxSize){
                    maxSize = end - init + 1;
                }
            }
            if(maxSize > maxForAllChar){
                maxForAllChar = maxSize;
            }
//            System.out.println("For char: "+ch +"->>"+ maxForAllChar);
        }
        return maxForAllChar;
    }
    public boolean valid(int chs[], int k, char ch){
        int count = 0;
        for(int i = 0 ;i < 26; i++){
            count = count + chs[i];
        }
        count = count - chs[ch-'A'];
        return count <= k;
    }
}
