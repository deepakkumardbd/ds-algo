package test;


//Q: WAP to get the following output
//        Input: I am Deepak Kumar
//        Output: r am uKkape eDmaI

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String args[]){
        String str = "I am Deepak kumar";
        System.out.println(findReverse(str));
    }

    public static String findReverse(String str){
        String returnStr = "";
        String returnStr1 = "";
        for(int i = str.length() - 1; i>=0; i--){
            if(str.charAt(i) == ' '){
                continue;
            }else {
                returnStr = returnStr + str.charAt(i);
            }
        }


        HashMap<Integer, Integer> contains = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ') {
                contains.put(i,0);
            }
        }

        int k = 0 ;
        int p = 0;

        while(k < returnStr.length()){
            if(contains.get(p) != null && contains.get(p) == 0){
                returnStr1 = returnStr1 + ' ';
                contains.put(k,1);
                p++;
            }else{
                returnStr1 = returnStr1 + returnStr.charAt(k);
                k++;
                p++;
            }
        }

        return returnStr1;
    }
}
