package cn.com.rpf.security.securitydemo1.algorithm;

import java.util.Arrays;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/11 18:35
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 7, 6, 8, 9};
        selection(arr);
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }

    /**
     * 选择排序
     *
     * @param arr 待排序数组
     */
    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int s = i;
            for (int j = s + 1; j < arr.length; j++) {
                if (arr[j] < arr[s]) {
                    s = j;
                }
            }
            if (s != i) {
                swap(arr, s, i);
            }
        }
    }

    private static void swap(int[] arr, int s, int i) {
        int m;
        m = arr[s];
        arr[s] = arr[i];
        arr[i] = m;
    }
}
