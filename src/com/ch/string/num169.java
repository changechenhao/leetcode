package com.ch.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-03-12-22-59
 **/
public class num169 {

    public int majorityElement(int[] nums) {
        int  top = nums.length;
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0 ; i < nums.length;i++){

            if(map.get(nums[i]) != null){
                map.put(nums[i], map.get(nums[i])+1);
                if(map.get(nums[i]) > nums.length/2){
                    return nums[i];
                }

            }else{
                map.put(nums[i], 0);
            }

        }
        return -1;
    }
}
