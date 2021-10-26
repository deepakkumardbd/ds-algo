package com.dp;

import java.util.Scanner;

public class GridTraveller {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row");
        int m = sc.nextInt();
        System.out.println("Enter number of columns");
        int n = sc.nextInt();
        long arr [][] = new long[m][n];
        for(int i = 0; i<m; i++){
            for(int j= 0;j< n; j++){
                arr[i][j] = -1;
            }
        }
        System.out.println(grid(m,n));
        System.out.println(grid(m-1,n-1,arr));
    }
    public static long grid(int m, int n){
        if( m < 1 || n < 1) return 0;
        if(m == 1 || n == 1) return 1;
        return grid(m-1,n) + grid (m,n-1);
    }
    public static long grid(int m, int n, long arr[][]){
        if(m == 0 && n == 0){
            arr[m][n] = 1;
        }else if(m < 0 || n < 0){
            return 0;
        }else if(arr[m][n] != -1){
            return arr[m][n];
        }
        else {
            arr[m][n] = grid(m-1,n,arr) + grid(m,n-1,arr);
        }
        return arr[m][n];
    }
}
