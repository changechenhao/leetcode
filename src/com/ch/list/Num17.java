package com.ch.list;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * @author : chenhao
 */
public class Num17 {


    /**
     * 水平扫描法
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        if(strs.length == 1){
            return strs[0];
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }


    /**
     * 分治法
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix2(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }


        return divide(strs, 0, strs.length);
    }

    public static String divide(String[] strs, int low, int high){
        if(low == high){
            return strs[low];
        }


        return "";
    }

    public static String comparte(){
        return "";
    }


}
