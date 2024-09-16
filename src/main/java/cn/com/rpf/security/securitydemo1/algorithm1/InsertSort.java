package cn.com.rpf.security.securitydemo1.algorithm1;

import cn.com.rpf.security.securitydemo1.util.CommonUtils;

import java.util.Arrays;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/14 12:20
 */
public class InsertSort {

    /**
     * 插入排序
     * 1、将数组分为两个区域，排序区域以及未排序区域，每一轮从未排序区域取出第一个元素，插入排序区域，要保证顺序
     * 2、重复上述步骤，直至有序
     *
     * 与选择排序相比
     * 1、二者时间复杂度都为O(n^2)
     * 2、大部分情况，插入优先与选择
     * 3、有序集合插入时间复杂度O(n)
     * 4、插入算法属于稳定算法
     */

    public static void main(String[] args) {
        int[] arr = CommonUtils.instanceArr();
        insert(arr);
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }

    private static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 要插入的值
            int t = arr[i];
            int j = i;
            while (j >= 1) {
                if (t < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                } else {
                    break;
                }
            }
            arr[j] = t;
        }
    }
}
