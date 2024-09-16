package cn.com.rpf.security.securitydemo1.algorithm;

import java.util.Arrays;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/11 19:00
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 7, 6, 8, 9};
        insertSort(arr);
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }

    /**
     * 插入排序
     *
     * @param arr 待排序数组
     */
    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int t = arr[i]; // 待插入值
            int j = i - 1; // 已排序区域的索引
            while (j >= 0) {
                if (t < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
                j--;
            }
            arr[j + 1] = t;
        }
    }
}
