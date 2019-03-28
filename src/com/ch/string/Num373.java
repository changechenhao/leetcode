package com.ch.string;

import java.util.*;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-03-28-23-36
 **/
public class Num373 {

    public static void main(String[] args) {
        int[] nums1 = {1,7,11};
        int[] nums2 = {2,4,6};
        kSmallestPairs2(nums1,nums2, 3);

    }

    public static List<int[]> kSmallestPairs2(int[] nums1, int[] nums2, int k) {
        List<int[]> res = new LinkedList<>();
        Queue<int[]> queue = new PriorityQueue<>(k,new Comparator<int[]>(){
            public int compare(int[] o1,int[] o2){
                int tmp1 = o1[0]+o1[1];
                int tmp2 = o2[0]+o2[1];

                return tmp1 - tmp2;//小顶堆
            }
        });

        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                queue.add(new int[]{nums1[i],nums2[j]});
            }
        }

        while(k-->0){
            int[] tmp = queue.poll();
            if(tmp == null)
                break;
            res.add(tmp);
        }

        return res;
    }
}
