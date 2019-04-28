package com.ch.list;

import java.util.Arrays;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-04-25-22-01
 **/
public class Num283 {

    //移动零
    public static void moveZeroes(int[] nums) {
        int size = nums.length;

        for(int i = size - 2; i >= 0; i--){
            for(int j = i ; j <= size -2 ;j++){
                if(nums[j]==0 && nums[j+1] !=0){

                    int b = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = b;
                }
            }


        }
    }

    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
