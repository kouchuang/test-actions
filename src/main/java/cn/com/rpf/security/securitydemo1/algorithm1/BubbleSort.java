package cn.com.rpf.security.securitydemo1.algorithm1;

import cn.com.rpf.security.securitydemo1.util.CommonUtils;

import java.util.Arrays;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/13 22:53
 */
public class BubbleSort {

    /**
     * 冒泡算法描述：
     * 1、依次比较相邻元素大小,若arr[i]>arr[i+1],则交换顺序,两两比较,直到集合变得有序
     */

    public static void main(String[] args) {
        int[] arr = CommonUtils.instanceArr();
        bubble(arr);
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }

    private static void bubble(int[] arr) {
        int n = arr.length - 1;
        while (true) {
            int last = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > arr[i + 1]) {
                    CommonUtils.swap(arr, i, i + 1);
                    last = i;
                }
            }
            n = last;
            if (n == 0) {
                break;
            }
        }

    }
}
