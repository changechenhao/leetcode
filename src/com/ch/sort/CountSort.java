package com.ch.sort;

/**
 * @author : chenhao
 */
public class CountSort{

    public void sort(int[] a){
        if(a == null){
            return;
        }

        int arrLength = a.length;
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < arrLength; i++){
            if(min > a[i]){
                min = a[i];
            }

            if(max < a[i]){
                max = a[i];
            }
        }

        int newArrLength = max - min +1;
        int[] newArr = new int[newArrLength];
        for (int i = 0; i < arrLength; i++) {
            newArr[a[i] - min]++;
        }

        for (int i = 1; i < arrLength; i++) {
            newArr[i] = newArr[i - 1] + newArr[i];
        }

        int[] auxiliary = new int[arrLength];
        for (int i = arrLength - 1; i >= 0 ; i--) {
            int index = newArr[a[i] - min] - 1;
            auxiliary[index] = a[i];
            newArr[a[i] - min]--;
        }

        for (int i = 0; i < arrLength; ++i){
            a[i] = auxiliary[i];
        }

    }

    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(a[0]++);
        System.out.println(a[0]);
    }

}
