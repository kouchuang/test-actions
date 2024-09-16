package cn.com.rpf.security.securitydemo1.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 自旋锁demo
 *
 * @author rpf
 * @version 1.0
 * @date 2021/10/18 14:28
 */
public class SpinLockDemo {

    /**
     * 自旋锁：是指尝试获取锁的线程不会阻塞,而是采用循环的方式尝试获取锁,
     * 好处：减少线程上下文切换的消耗
     * 缺点：循环会消耗cpu性能
     */

    // 原子引用执行线程
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "获取锁, invoked myLock()");
        while (!atomicReference.compareAndSet(null, thread)) {
        }
    }

    public void myUnLock() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "释放锁, invoked myUnLock()");
        atomicReference.compareAndSet(thread, null);
    }

    public static void main(String[] args) {
        SpinLockDemo spinLockDemo = new SpinLockDemo();
        new Thread(() -> {
            spinLockDemo.myLock();
            try {
                // 持有锁5s
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.myUnLock();
        }, "AA").start();
        new Thread(() -> {
            spinLockDemo.myLock();
            try {
                // 持有锁1s
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.myUnLock();
        }, "BB").start();
    }
}
