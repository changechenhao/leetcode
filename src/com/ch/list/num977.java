package com.ch.list;

import java.util.Arrays;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-03-17-17-46
 **/
public class num977 {

    public static int[] sortedSquares(int[] A) {
        if (A == null || A.length <= 0 ){
            return null;
        }

        int len = A.length;
        int pos = 0;
        for (int i = 0; i < len; i++) {
            if(A[i] < 0){
                if(i + 1 < len && A[i+1] >= 0){
                    pos = i + 1;
                }
            }
            A[i] = A[i] * A[i];
        }

        if(pos == 0){
            return A;
        }else if(pos == len){
            int out = 0;
            for(int i = 0,j = len - 1;i < len/2 ; i++){
                out = A[i];
                A[i] = A[j];
                A[j] = out;
            }
            return A;
        }else{
            int i = pos - 1,j = pos,t = 0;
            int[] ans = new int[len];
            while (i >= 0 && j < len) {
                if (A[i] < A[j]) {
                    ans[t++] = A[i];
                    i--;
                } else {
                    ans[t++] = A[j];
                    j++;
                }
            }

            while (i >= 0) {
                ans[t++] = A[i];
                i--;
            }

            while (j < len) {
                ans[t++] = A[j];
                j++;
            }
            return ans;
        }
    }

    //官方标准
    public int[] sortedSquares2(int[] A) {
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0)
            j++;
        int i = j-1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {-2,0};
        System.out.println(Arrays.toString(sortedSquares(A)));
    }
}
