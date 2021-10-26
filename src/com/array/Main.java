package com.array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of elements you want to add");
	    int n = sc.nextInt();
        int arr[] = new int[100000000];
	    System.out.println("Enter the numbers");
	    for(int i=0;i<n;i++){
	         arr[i] = sc.nextInt();
        }
	    int sum = 0;
	    for(int i=0;i<n;i++){
	        sum = sum + arr[i];
        }

	    System.out.println("The sum of the numbers is :"+ sum);
    }
}
