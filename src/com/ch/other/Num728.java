package com.ch.other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-03-23-23-14
 **/
public class Num728 {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        boolean isSelf;
        for (int i = left; i < right + 1; i++) {

            Integer integer = i;
            String str = String.valueOf(integer);
            isSelf = true;
            if(str.contains("0")){
                continue;
            }
            for (int j = 0; j < str.length(); j ++){
                if(integer % Integer.parseInt(String.valueOf(str.charAt(j))) != 0){
                    isSelf = false;
                    break;
                }
            }
            if(isSelf){
                list.add(integer);
            }

        }
        return list;
    }


    public static List<Integer> selfDividingNumbers2(int left, int right) {
        List<Integer> list=new LinkedList<>();
        for(int i=left;i<=right;i++){
            int n=i;
            int m=n;
            while(n!=0){
                if(n%10==0||m%(n%10)!=0){
                    break;
                }
                n=n/10;
            }
            if(n==0){
                list.add(m);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22).toString());
    }
}
