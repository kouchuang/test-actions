package cn.com.rpf.security.securitydemo1.test;

import java.util.concurrent.CountDownLatch;

/**
 * 倒计时锁存器
 *
 * @author rpf
 * @version 1.0
 * @date 2021/10/18 16:18
 */
public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {

    }

    private static void closeDoor() throws InterruptedException {
        CountDownLatch count = new CountDownLatch(6);
        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t 离开");
                count.countDown();
            }, String.valueOf(i)).start();
        }
        count.await();
        System.out.println(Thread.currentThread().getName() + "完成");
    }
}
