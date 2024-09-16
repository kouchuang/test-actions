package cn.com.rpf.security.securitydemo1.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁demo
 *
 * @author rpf
 * @version 1.0
 * @date 2021/10/18 15:48
 */
public class ReadWriteLockDemo {

    public static void main(String[] args) {
        MyCache myCache = new MyCache();
        for (int i = 1; i <= 5; i++) {
            final int num = i;
            new Thread(() -> myCache.put(num + "", num + ""), String.valueOf(i))
                    .start();
        }
        for (int i = 1; i <= 5; i++) {
            final int num = i;
            new Thread(() -> myCache.get(num + ""), String.valueOf(i))
                    .start();
        }
    }
}

class MyCache {

    private volatile Map<String, Object> map = new HashMap<>();
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void put(String key, Object obj) {
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "写入数据");
            TimeUnit.MILLISECONDS.sleep(300);
            map.put(key, obj);
            System.out.println(Thread.currentThread().getName() + "写入完成, key:" + key + "  value:" + obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void get(String key) {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "读取数据");
            TimeUnit.MILLISECONDS.sleep(300);
            System.out.println(Thread.currentThread().getName() + "读取的数据, key:" + key + "  value:" + map.get(key));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().lock();
        }
    }
}