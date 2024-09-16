package cn.com.rpf.security.securitydemo1.review;

import java.util.Arrays;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/12 9:44
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 7, 6, 8, 9};
        insertSort(arr);
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }

    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 待插入值
            int t = arr[i];
            // 已排序区的索引
            int j = i - 1;
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
