package cn.com.rpf.security.securitydemo1.algorithm;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/11 10:34
 */
public class BinarySearchSort {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 11, 19, 21, 23, 32, 35, 40, 45, 48, 55};
        int target = 1;
        System.out.println(binarySearch(arr, target));
    }

    /**
     * 折半查找
     *
     * @param arr    需查找数组【已顺序排序】
     * @param target 目标值
     * @return 目标索引
     */
    public static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1, m;
        while (l <= r) {
            m = l + (r - l) >>> 1;
            if (arr[m] == target) {
                return m;
            } else if (arr[m] < target) {
                l = m + 1;
            } else if (arr[m] > target) {
                r = m - 1;
            }
        }
        return -1;
    }
}
