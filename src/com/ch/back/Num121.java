package com.ch.back;

/**
 * @Author : chenhao
 * @Date : 2020/1/17 0017 16:57
 */
public class Num121 {

    public int maxProfit(int[] prices) {
        if(prices == null || prices.length ==0){
            return 0;
        }
        int maxProfit = 0;
        int maxPrice = 0;
        int n = prices.length;
        int minPrice = prices[0];
        for (int i = 0; i < n; i++) {
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        Num121 num121 = new Num121();
        int[] a = new int[]{7,1,5,3,6,4};
        System.out.println(num121.maxProfit(a));
    }
}
