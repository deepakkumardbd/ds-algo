package com.experiment;

import java.util.*;

public class Exp6 {
    public static void main(String args[]) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(1);

        set.add(arr);
        set.add(arr2);
        Iterator<List<Integer>> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
