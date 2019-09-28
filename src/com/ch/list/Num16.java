package com.ch.list;

import java.util.Arrays;

public class Num16 {

    public  static int threeSumClosest(int[] nums,  int target) {
        //对数组进行排序
        if (nums == null) {
            return 0;
        }

        //对数组nums进行排序
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int current = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            //数字k要从最大的数字（最后一个向前跑）
            while (j < k) {
                current = nums[i] + nums[j] + nums[k] - target;
                if (current == 0) {
                    return nums[i] + nums[j] + nums[k];
                } else if (current < 0) {
                    j++;
                } else {
                    k--;
                }

                if(Math.abs(current) < min){
                    min = Math.abs(current);
                    sum = current+target;
                }
            }

        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

}
