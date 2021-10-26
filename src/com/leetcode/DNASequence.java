package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DNASequence {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        ArrayList<String> returnVal = new ArrayList<>();
        int k = 0;
        for(int i= 10 ;i < s.length();i++){
            String str = s.substring(k++,i);
            if(!hashMap.containsKey(str)){
                hashMap.put(str,1);
            }else{
                hashMap.put(str,(hashMap.get(str)+1));
            }
        }
        for(Map.Entry<String, Integer> e : hashMap.entrySet()){
            if( e.getValue() > 1 ){
                returnVal.add(e.getKey());
            }
        }
        return returnVal;
    }
}