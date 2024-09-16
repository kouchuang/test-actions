package cn.com.rpf.security.securitydemo1.test;

import java.util.Scanner;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/10/27 14:13
 */
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("圆柱的半径是:");
        int radius = sc.nextInt();
        System.out.println("圆柱的高是:");
        int high = sc.nextInt();
        final float PI = 3.14F;
        // 表面积
        float surfaceArea = PI * radius * radius * 2 + 2 * PI * radius;
        System.out.println("圆的表面积是:\t" + surfaceArea);
        System.out.println("圆的周长是:\t" + 2 * PI * radius);
        System.out.println("圆的体积是:\t" + PI * radius * radius * high);

    }
}
