package com.ch.back;

/**
 * @Author : chenhao
 * @Date : 2020/1/18 0018 10:08
 */
public class Num62 {

    public int uniquePaths(int m, int n) {
        return uniquePaths(m, n, 1, 1 , 0);
    }

    public int uniquePaths(int m, int n, int rigth, int down, int total) {
        if(m == rigth && down == n){
            return total + 1;
        }

        if(rigth < m){
            total = uniquePaths(m, n, rigth + 1, down, total);
        }

        if(down < n){
            total = uniquePaths(m, n, rigth, down + 1, total);
        }

        return total;
    }

    public int uniquePaths2(int m, int n) {
        if(m == 0 || n ==0){
            return 1;
        }
        int[][] nums = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0){
                    nums[i][j] = 1;
                }else{
                    nums[i][j] = nums[i - 1][j] + nums[i][j - 1];
                }
            }
        }

        return nums[m - 1][n - 1];
    }


    public static void main(String[] args) {
        Num62 num62 = new Num62();
//        System.out.println(num62.uniquePaths(51, 9));
        System.out.println(num62.uniquePaths2(51, 9));
    }
}
