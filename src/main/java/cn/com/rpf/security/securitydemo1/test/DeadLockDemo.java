package cn.com.rpf.security.securitydemo1.test;

import java.util.concurrent.TimeUnit;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/10/26 16:56
 */
public class DeadLockDemo {

    public static void main(String[] args) {
        System.out.println(15 & 2);
//        String lockA = "lockA";
//        String lockB = "lockB";
//        lockA.hashCode();
//        new Thread(new DeadLock(lockA, lockB), "ThreadAAA").start();
//        new Thread(new DeadLock(lockB, lockA), "ThreadBBB").start();
    }
}


class DeadLock implements Runnable {
    private String lockA;
    private String lockB;

    public DeadLock(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + "持有lockA,并尝试获取lockB");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + "持有lockB,并尝试获取lockA");
            }
        }
    }
}