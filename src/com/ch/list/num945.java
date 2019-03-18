package com.ch.list;

import java.util.Arrays;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-03-17-18-28
 **/
public class num945 {

    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int sum=0;
        for (int i=0;i<A.length-1;i++){
            /**
             * A[i] == A[i+1],相邻的两个数相等，后面的数+1，移动一次
             * A[i]>A[i+1]，因为数组是排过序的，一般A[i]>A[i+1]是因为经过上面+1，且A[i]原来的值一定等于A[i+1],
             * 例如：原始数组【1,3,4,4,4,4】
             * 当i = 2时，数组为【1,3,4,4,4,4,4】，A[2] == A[3],A[3] + 1, sum++
             * 当i = 3时当，数组为【1,3,4,5,4,4】，A[i] = 5 > A[i+1] = 4, 所以需要 A[i+1] 移动 2 次
             * 当i = 4时当，数组为【1,3,4,5,6,4】，A[i] = 5 > A[i+1] = 4, 所以需要 A[i+1] 移动 3 次
             * 由上述可知，移动次数为 A[i] + 1 - A[i+1]，所以当前移动总数 sum = sum + A[i] + 1 - A[i+1]
             */
            if(A[i]==A[i+1]){
                A[i+1]++;
                sum++;
            }else if (A[i]>A[i+1]){
                sum=sum+A[i]+1-A[i+1];
                A[i+1]=A[i]+1;
            }
        }

        return sum;
    }

}
