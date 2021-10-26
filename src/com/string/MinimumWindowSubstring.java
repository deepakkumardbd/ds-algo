package com.string;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Properties;


public class MinimumWindowSubstring {
    public static void main(String args[]) throws IOException {

        InputStream input = new FileInputStream("src/com/resources/config.properties");
        Properties prop = new Properties();
        prop.load(input);
        String s = prop.getProperty("s");
        String t = prop.getProperty("t");

        Instant time1 = Instant.now();
        System.out.println("The string is "+ minWindow(s,t));
        Instant time2 = Instant.now();
        System.out.println(time1 + "----> " + time2);
    }
        public static String minWindow(String s, String t) {
            int prevPos = 0;
            int firstOccurrence = 0;
            ArrayList<String> list = new ArrayList<>();
            ArrayList<Character> set = new ArrayList<>();
            if(s.length() < t.length()){
                return "";
            }
            for (int i = 0; i < t.length(); i++) {
                set.add(t.charAt(i));
            }
            for (int i = 0; i < s.length(); i++) {
                char charinS = s.charAt(i);
                if (!set.isEmpty() && set.contains(charinS)) {
                    if (firstOccurrence == 0) {
                        prevPos = i;
                        firstOccurrence = 1;
                    }
                    remove(set,charinS);
                } else {
                    continue;
                }

                if (set.isEmpty()) {
                    list.add(s.substring(prevPos, i+1));
                    for (int j = 0; j < t.length(); j++) {
                        set.add(t.charAt(j));
                    }
                    firstOccurrence = 0;
                    i = prevPos ;
                }

            }
            return findStr(list);
        }
        public static String findStr(ArrayList<String> list){
            int leastSize = Integer.MAX_VALUE;
            String str = "";
            for(int i = 0; i< list.size(); i++){
                // System.out.println(list.get(i));
                if(list.get(i).length() < leastSize){
                    leastSize = list.get(i).length();
                    str = list.get(i);
                }
            }
            return str;
        }
        static void remove(ArrayList<Character> set, char ch){
            for(int i = 0; i< set.size(); i++){
                if(ch == set.get(i)){
                    set.remove(i);
                    break;
                }
            }
        }
}
