package com.ch.list;

import java.util.Objects;

/**
 * @author : chenhao
 */
public class Num137 {

    public static int onlyOnce(int[] a){
        if(Objects.isNull(a)){
            return -1;
        }

        int num = a[0];
        for (int i = 1; i < a.length; i++) {
            num = num ^ a[i];
        }
        return num;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 2, 1};
        System.out.println(onlyOnce(a));
    }
}
