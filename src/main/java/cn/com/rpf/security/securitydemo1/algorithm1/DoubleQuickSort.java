package cn.com.rpf.security.securitydemo1.algorithm1;

import cn.com.rpf.security.securitydemo1.util.CommonUtils;

import java.util.Arrays;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/14 13:15
 */
public class DoubleQuickSort {

    public static void main(String[] args) {
        int[] arr = CommonUtils.instanceArr();
        quickSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int p = partition(arr, l, r);
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }

    private static int partition(int[] arr, int l, int r) {
        // 分区基点元素
        int t = arr[l];
        int i = l;
        int j = r;
        while (i < j) {
            // 右边找小的
            while (i < j && arr[j] > t) {
                j--;
            }
            // 左边找大的
            while (i < j && arr[i] <= t) {
                i++;
            }
            CommonUtils.swap(arr, i, j);
        }
        CommonUtils.swap(arr, l, j);
        return j;
    }
}
