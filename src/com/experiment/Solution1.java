package com.experiment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
//        String name = s.nextLine();                 // Reading input from STDIN
//        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        int arr[] = {2 , 4,  10 , 10,  10 , 18 , 20};
        int key = 10;
        Solution1 s1 = new Solution1();
        List<Integer> returnVal = s1.getOccurrence(arr,key);
        System.out.println("first index :"+ returnVal.get(0) + " Second index :"+ returnVal.get(1));
    }

    public List<Integer> getOccurrence(int arr[], int k){
        List<Integer> returnVal = new ArrayList<Integer>();
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        for(int i = 0 ; i < arr.length; i++) {
            if (firstOccurrence == -1 && arr[i] == k) {
                firstOccurrence = i;
            }

            if (firstOccurrence != -1 && arr[i] == k) {
                lastOccurrence = i;
            }
        }
        returnVal.add(firstOccurrence);
        returnVal.add(lastOccurrence);
        return returnVal;
    }
}
