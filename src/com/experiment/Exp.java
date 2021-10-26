package com.experiment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Exp {

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(0,2,1,1,1,1,1,1));
        System.out.println(Arrays.toString(nums.toArray()));
        nums.remove(nums.size() - 1 );
        System.out.println(Arrays.toString(nums.toArray()));
        nums.remove(new Integer(1));
        System.out.println(Arrays.toString(nums.toArray()));
    }
}