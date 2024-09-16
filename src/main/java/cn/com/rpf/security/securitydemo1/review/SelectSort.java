package cn.com.rpf.security.securitydemo1.review;

import java.util.Arrays;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/11/12 10:30
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 7, 6, 8, 9};
        selection(arr);
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }

    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int s = i;
            for (int j = s + 1; j < arr.length; j++) {
                if (arr[j] < arr[s]) {
                    s = j;
                }
            }
            if (s != i) {
                swap(arr, i, s);
            }
        }
    }

    private static void swap(int[] arr, int s, int i) {
        int m;
        m = arr[s];
        arr[s] = arr[i];
        arr[i] = m;
    }
}
