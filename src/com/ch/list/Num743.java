package com.ch.list;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-03-19-22-44
 **/
public class Num743 {

    public static int networkDelayTime(int[][] times,int K) {
        int cloum = times.length;
        int row = times[0].length;
        int pos = 1;
        int i = 0,j = 0;
        while (i < cloum - 1 && j < row - 1){

            if(pos == K){
                return times[i][j];
            }

            if(times[i+1][j] < times[i][j+1]){
                i ++ ;
            }else{
                j ++ ;
            }

            pos ++;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[][] times = {
                {1,3,4},
                {2,4,5},
                {3,5,6}
        };

        System.out.println(networkDelayTime(times,6));
    }
}
