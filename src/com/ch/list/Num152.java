package com.ch.list;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-04-25-22-00
 **/
public class Num152 {

    //最大乘积子序列
    public int maxProduct(int[] nums) {
        if(nums == null){
            throw new RuntimeException("数组不能为空");
        }


        int size = nums.length;

        if(size <= 1){
            return nums[0];
        }
        int max = nums[0] * nums[1];

        for(int i=1; i < size - 1; i++){
            int num = nums[i] * nums[i+1];
            if(max < num){
                max = nums[i] * nums[i+1];
            }
        }
        return max;


    }


}
