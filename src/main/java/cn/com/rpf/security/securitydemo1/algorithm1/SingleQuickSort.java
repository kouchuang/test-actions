package cn.com.rpf.security.securitydemo1.algorithm1;

import cn.com.rpf.security.securitydemo1.util.CommonUtils;

import java.util.Arrays;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/14 12:40
 */
public class SingleQuickSort {

    /**
     * 单边快排
     * 算法描述
     * 每一轮排序选择一个基准点（pivot）进行分区
     * 让小于基准点的元素的进入一个分区，大于基准点的元素的进入另一个分区
     * 当分区完成时，基准点元素的位置就是其最终位置
     * 在子分区内重复以上过程，直至子分区元素个数少于等于 1，这体现的是分而治之的思想
     * 从以上描述可以看出，一个关键在于分区算法，常见的有洛穆托分区方案、双边循环分区方案、霍尔分区方案
     * <p>
     * 1、选择最右元素作为分区元素
     * 2、j指针负责寻找比分区元素小的，一旦找到与i交换
     * 3、i指针维护小于基准点元素的边界，也是每次交换的目标索引
     * 4、最后基准点与 i 交换，i 即为分区位置
     */

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
        int pv = arr[r];
        int i = l;
        for (int j = l; j < r; j++) {
            if (arr[j] < pv) {
                if (i != j) {
                    CommonUtils.swap(arr, i, j);
                }
                i++;
            }
        }
        if (i != r) {
            CommonUtils.swap(arr, i, r);
        }
        return i;
    }
}
