package com.ch.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Num15 {

    public List<List<Integer>> threeSum(int[] nums) {
        /*
         *首先用三个for循环是不行的因为三个for时间复杂对超过了，那么我的思路就是遍历数组时进行两个指针
         *进行遍历，利用hashset不可重复进行判断重复，我们队数组排序使得它可以让进入到set中的数组相同
         */
        //对数组进行排序
        if (nums == null) {
            return null;
        }
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        //对数组nums进行排序
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            //数字k要从最大的数字（最后一个向前跑）
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> result = new ArrayList<Integer>();
                    result.add(nums[i]);
                    result.add(nums[j]);
                    result.add(nums[k]);
                    set.add(result);
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k-1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }

            }

        }

        return new ArrayList<>(set);

    }



}
