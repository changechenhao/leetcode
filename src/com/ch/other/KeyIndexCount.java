package com.ch.other;

/**
 * 键索引计数法
 *
 * @author : chenhao
 */
public class KeyIndexCount {


    public static void sort(Node[] a, int R){
        int n = a.length;
        int[] count = new int[R + 1];
        Node[] aux = new Node[n];
        for (int i = 0; i < n; i++) {
            count[a[i].key + 1]++;
        }

        for (int i = 0; i < R; i++) {
            count[i+1] += count[i];
        }

        for (int i = 0; i < n; i++) {
            aux[count[a[i].key]++] = a[i];
        }

        for (int i = 0; i < n; i++) {
            a[i] = aux[i];
        }
        System.out.println("11");

    }


    private static class Node{
        int key;
        String value;
    }
}
