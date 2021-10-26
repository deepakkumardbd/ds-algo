package com.experiment;

import java.util.ArrayList;

public class NextPerm {
    public static void main(String args[]){
        int arr[]= {0,0,4,2,1,0};
        NextPerm nextPerm = new NextPerm();
        nextPerm.nextPermutation(arr);
    }
    public void nextPermutation(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num * 10 + nums[i];
        }
        ArrayList<Integer> arrList = new ArrayList();
        findNext(nums, 0, nums.length, num, arrList);
        int diff = Integer.MAX_VALUE;
        int nextBig = Integer.MAX_VALUE;
        for(int i = 0; i < arrList.size(); i++){
            System.out.println(arrList.get(i));
        }
        for (int i = 0; i < arrList.size(); i++) {
            int val = arrList.get(i) - num;
            System.out.println("val : "+ val);
            if (val > 0 && val < diff) {
                diff = val;
                nextBig = arrList.get(i);
            }
        }
        int diff2 = Integer.MAX_VALUE;
        if(nextBig == Integer.MAX_VALUE){
            for(int i = 0 ; i < arrList.size();i++){
                int val = arrList.get(i) - num;
                System.out.println("negative val : "+ val);
                if(val < 0 && val < diff2) {
                    diff2 = val;
                    nextBig = arrList.get(i);
                }
            }
        }
        if(nextBig == Integer.MAX_VALUE){
            nextBig = num;
        }
        String temp = Integer.toString(nextBig);
        System.out.println("temp :" + temp);
        for (int i = 0; i < nums.length; i++) {
            try{
                nums[i] = temp.charAt(i) - '0';
            }catch(Exception ex){
                nums[i] = 0;
            }
            System.out.println("nums i :" + nums[i]);
        }
        for(int i= 0 ;i < nums.length; i++){
            System.out.print(nums[i]);
        }
    }

    void findNext(int nums[], int begin, int end, int num, ArrayList<Integer> arrList) {
        int number = 0;
        if (begin == end) {
            int number1 = 0;
            for (int i = 0; i < nums.length; i++) {
                number1 = number1 * 10 + nums[i];
            }
            arrList.add(number1);
        }
        for (int i = begin; i < nums.length; i++) {
            swap(nums, begin, i);
            findNext(nums, begin+1, end, num, arrList);
            swap(nums, begin, i);
        }
    }

    void swap(int nums[], int begin, int end) {
        int temp = nums[begin];
        nums[begin] = nums[end];
        nums[end] = temp;
    }
}

