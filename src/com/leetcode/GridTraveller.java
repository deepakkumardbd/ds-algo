package com.leetcode;

public class GridTraveller {
        public int uniquePaths(int m, int n) {
            return gridUnique(m,n,1,1);
        }

        int gridUnique(int m, int n, int i, int j) {
            if (i > m || j > n) {
                return 0;
            }
            if (i == m && j == n) {
                return 1;
            } else {
                return gridUnique(m, n, i + 1, j) + gridUnique(m, n, i, j + 1);
            }
        }

        public static void main(String args[]){
            GridTraveller gd = new GridTraveller();
            System.out.println(gd.uniquePaths(25,9));
        }
}
