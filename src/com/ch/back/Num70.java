package com.ch.back;

/**
 * @Author : chenhao
 * @Date : 2020/2/1 0001 1:06
 */
public class Num70 {

    public int climbStairs(int n) {
        if(n <= 0){
            return 0;
        }
        return climbStairs(0, n, 0);
    }

    public int climbStairs(int num, int n, int total){
        if(num == n){
            return total + 1;
        }

        if(num == n -1){
            total = climbStairs(num + 1, n, total);
        }

        if(num <= n - 2){
            total = climbStairs(num + 1, n, total);
            total = climbStairs(num + 2, n, total);
        }

        return total;
    }

    public static void main(String[] args) {
        Num70 num70 = new Num70();
        System.out.println(num70.climbStairs(45));
    }
}
