package com.ch.other;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-03-20-23-27
 **/
public class Num70 {

    public int climbStairs(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int f1 = 1;
        int f2 = 2;
        int result = 0;
        //每一次都存储f(n) = f(n-1) + f(n-2)
        for(int i=3; i<=n; i++){
            result = f1 + f2;//f1代表f(n-2) f2即代表f(n-1) result为f(n)
            f1 = f2; //f(n-1) = f(n-2),把f(n-2)的值保留下来
            f2 = result;//f(n)的值保留下来
        }
        return result;
    }
}
