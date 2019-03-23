package com.ch.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-03-17-19-56
 **/
public class Test {
    public static void main(String[] args) {
        Queue<Integer> heap = new PriorityQueue<>(2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(heap.size());
        heap.add(1);
        heap.add(2);
        heap.add(0);
        System.out.println(heap.size());
        for (int i = 0; i < heap.size(); i++) {
            System.out.println(heap.poll() + "--" + i);
        }


    }
}
