package com.ch.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-03-11-22-29
 **/
public class Num3 {

    //滑动窗口
    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbert"));
    }
}
