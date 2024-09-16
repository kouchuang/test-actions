package cn.com.rpf.security.securitydemo1.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 循环屏障demo
 *
 * @author rpf
 * @version 1.0
 * @date 2021/10/18 16:48
 */
public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> System.out.println("*******循环屏障演示完成"));
        for (int i = 1; i <= 7; i++) {
            final int num = i;
            new Thread(() -> {
                System.out.println(num + "\t准备");
                try {
                    cyclicBarrier.await();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }
    }
}
