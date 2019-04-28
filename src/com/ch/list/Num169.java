package com.ch.list;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-04-25-22-02
 **/
public class Num169 {

    //求众数
    public int majorityElement(int[] nums) {
        Map<String, Integer> map = new HashMap<>();

        if(nums.length == 1){
            return nums[0];
        }

        for(int i = 0 ; i < nums.length ; i++){
            Integer s = map.get(String.valueOf(nums[i]));
            if(s == null){
                map.put(String.valueOf(nums[i]),1);
            }else{
                if(s + 1 > nums.length/2){
                    return nums[i];
                }
                map.put(String.valueOf(nums[i]),s+1);
            }

        }
        return -1;
    }

    public int majorityElement2(int[] nums) {
        int count = 0;
        int value = 0;
        for(int x:nums) {
            if(count == 0){
                value = x;
                count = 1;
            } else if(value == x){
                count++;
            } else {
                count--;
            }
        }
        return value;
    }







}
