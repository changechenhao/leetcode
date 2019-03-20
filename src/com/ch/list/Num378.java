package com.ch.list;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-03-19-22-52
 **/
public class Num378 {

    public int kthSmallest(int[][] matrix, int k){
        Queue<Integer> heap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int[] row : matrix){
            for(int col : row){
                if(heap.size() < k)
                    heap.add(col);
                else{

                    if(col < heap.peek()){
                        heap.poll();
                        heap.add(col);
                    }
                }
            }
        }
        return heap.peek();
    }



}
