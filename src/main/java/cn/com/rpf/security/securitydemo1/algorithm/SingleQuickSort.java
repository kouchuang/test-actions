package cn.com.rpf.security.securitydemo1.algorithm;

import java.util.Arrays;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/12 15:04
 */
public class SingleQuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 9, 7, 6, 8, 4};
        quick(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }

    private static void quick(int[] arr, int l, int h) {
        if (l >= h) {
            return;
        }
        int i = partition(arr, l, h);
        quick(arr, l, i - 1);
        quick(arr, i + 1, h);
    }

    /**
     * 单边快排
     *
     * @param arr 待排序数组
     * @param l   分区组边界
     * @param h   分区比较值
     * @return
     */
    private static int partition(int[] arr, int l, int h) {
        int pv = arr[h];
        int i = l;
        for (int j = l; j < h; j++) {
            if (arr[j] < pv) {
                if (i != j)
                    swap(arr, i, j);
                i++;
            }
        }
        if (i != h)
            swap(arr, i, h);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int m = arr[i];
        arr[i] = arr[j];
        arr[j] = m;
    }
}
