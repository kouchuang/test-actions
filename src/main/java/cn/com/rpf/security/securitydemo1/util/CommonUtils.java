package cn.com.rpf.security.securitydemo1.util;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/13 22:40
 */
public class CommonUtils {

    /**
     * 测试
     *
     * @return 测试数组
     */
    public static int[] instanceArr() {
        int[] arr = {1, 7, 5, 3, 2, 9, 8, 11, 4, 6};
        return arr;
    }

    /**
     * 数组元素交换
     *
     * @param arr 待交换数组
     * @param i   交换值下标
     * @param j   交换值下标
     */
    public static void swap(int[] arr, int i, int j) {
        int m = arr[i];
        arr[i] = arr[j];
        arr[j] = m;
    }
}
