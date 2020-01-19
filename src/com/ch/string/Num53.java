package com.ch.string;

/**
 * @Author : chenhao
 * @Date : 2020/1/17 0017 16:45
 */
public class Num53 {

    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int max = nums[0];
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum <= 0){
                sum = 0;
            }
        }

        return max;

    }
}
