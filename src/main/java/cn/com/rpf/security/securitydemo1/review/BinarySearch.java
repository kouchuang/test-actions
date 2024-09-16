package cn.com.rpf.security.securitydemo1.review;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/12 9:03
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 11, 19, 21, 23, 32, 35, 40, 45, 48, 55};
        int target = 5;
        System.out.println(binarySearchSort(arr, target));
    }

    private static int binarySearchSort(int[] arr, int target) {
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
        m = -1;
        return m;
    }
}
