package com.ch.back;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : chenhao
 * @Date : 2020/1/18 0018 16:45
 */
public class Num46 {

    public List<List<Integer>> permute(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }

        List<List<Integer>> lists = new ArrayList<>();
        permute(nums, lists, new ArrayList<>());

        return lists;
    }

    public void permute(int[] nums, List<List<Integer>> lists, List<Integer> list) {
        if(nums.length == list.size()){
            lists.add(new ArrayList<>(list));
        }

        for (int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i])){
                continue;
            }

            list.add(nums[i]);
            permute(nums, lists, list);
            list.remove(list.size() - 1);
        }

    }


}
