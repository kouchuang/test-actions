package cn.com.rpf.security.securitydemo1.algorithm1;

import cn.com.rpf.security.securitydemo1.util.CommonUtils;

import java.util.Arrays;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/13 22:38
 */
public class BinarySort {

    /**
     * 折半查找
     * 假设已有一个排序好的数组
     * 设置左右边界以及中间值
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 9, 11, 13, 15};
        int target = 14;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        // 设置左右边界以及中间值
        int l = 0, r = arr.length - 1, m;
        while (l <= r) {
            m = (l + r) >>> 1;
            if (arr[m] == target) {
                return m;
            } else if (arr[m] > target) {
                r = m - 1;
            } else if (arr[m] < target) {
                l = m + 1;
            }
        }
        return -1;
    }
}
