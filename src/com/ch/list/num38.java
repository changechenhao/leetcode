package com.ch.list;

/**
 * @Author chenhao
 * @Description
 * @Date 2019-03-12-22-58
 **/
public class num38 {

    //左下角开始
    public int searchMatrix(int[][] matrix, int target) {
        int res = 0;
        if (null == matrix || 0 == matrix.length)
            return res;
        int row = matrix.length;
        int colum = matrix[0].length;
        int i = row - 1;
        int j = 0;
        while (i >= 0 && j < colum) {
            if (target == matrix[i][j]) {
                res++;
                i--;
                j++;
            } else if (target > matrix[i][j]) {
                j++;
            } else {
                i--;
            }
        }
        return res;
    }
}
