package cn.com.rpf.security.securitydemo1.review;

import java.util.Arrays;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/12 9:18
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 7, 6, 8, 9};
        bubble(arr);
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }

    private static void bubble(int[] arr) {
        int n = arr.length - 1;
        while (true) {
            int last = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i);
                    last = i;
                }
            }
            n = last;
            if (n == 0) {
                break;
            }
        }

    }

    private static void swap(int[] arr, int i) {
        int m;
        m = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = m;
    }
}
