package com.experiment;


public class EXP5 {
    public static void main(String args[]){
        int x = 10;
        for(int i = 0; i < 26;i++){
            x = ++x;
//            x = x++ + ++x;
        }
        System.out.println(x);

        check(10);
    }

    public static void check(int i){
        int j = i;
        while(i<11){
            while(j < 20){
                System.out.println(i +" "+ j);
                i++;
                j++;
            }
        }
    }
}
