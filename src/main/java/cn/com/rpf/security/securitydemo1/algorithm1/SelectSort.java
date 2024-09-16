package cn.com.rpf.security.securitydemo1.algorithm1;

import cn.com.rpf.security.securitydemo1.util.CommonUtils;

import java.util.Arrays;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/13 23:24
 */
public class SelectSort {

    /**
     * 选择排序
     * 1、将数组分为两个子集，排序的和未排序的,每一轮从未排序的子集中挑出最小的，放入排序子集
     * 2、重复以上步骤，直到有序
     *
     * 与冒泡排序相比
     * 1、二者的数据平均时间复杂度都为O(n^2)
     * 2、选择排序要快于冒泡排序, 因为交换次数少
     * 3、如果集合有序度高,冒泡优于选择
     * 4、冒泡稳定,选择不稳定排序
     *      稳定指的,按对象不同字段进行多次排序,不会打乱同值元素的顺序
     */

    public static void main(String[] args) {
        int[] arr = CommonUtils.instanceArr();
        selectSort(arr);
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 设置有序子集下标
            int s = i;
            for (int j = s + 1; j < arr.length; j++) {
                if (arr[s] > arr[j]) {
                    // 找出未排序子集中最小值
                    s = j;
                }
            }
            if (s != i) {
                CommonUtils.swap(arr, s, i);
            }
        }
    }
}

