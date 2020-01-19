package com.ch.string;

/**
 * @Author : chenhao
 * @Date : 2020/1/16 0016 9:30
 */
public class Num5 {

    public String longestPalindrome(String s) {
        if(s == null ||  s.isEmpty()){
            return s;
        }

        int n = s.length();
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            int length1 = search(s, i, i);
            int length2 = search(s, i, i + 1);
            int len = Math.max(length1, length2);
            if(len > end - start + 1){
                start = i - (len - 1) /2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public int search(String s, int left, int rigth){
        int L = left;
        int R =  rigth;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)){
            L --;
            R ++;
        }

        return R - L - 1;
    }

    public String longestPalindrome2(String s) {
        if(s == null ||  s.isEmpty()){
            return s;
        }

        int n = s.length();
        boolean[][] b = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                b[i][j] = b[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                if(b[i][j]){

                }
            }
        }



        return "";
    }
}
