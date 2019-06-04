package com.ch.sort;

/**
 * @author : chenhao
 */
public class Sort {

    public void swap(int[] a, int i , int j){
        int tmp =  a[i];
        a[i] = a[j];
        a[j] = tmp;
    }


}
