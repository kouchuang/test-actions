package cn.com.rpf.security.securitydemo1.test;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/10/11 15:25
 */
public class Test {

    public static void main(String[] args) {
//        int i = 1;
//        i = i++;
//        int j = i++;
//        int k = i + ++i * i++;
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(k);
        // cas 它是一条cpu并发原语
//        AtomicInteger atomicInteger = new AtomicInteger(5);
//        atomicInteger.compareAndSet(5, 6);
//        System.out.println(atomicInteger.get());
//        List<String> list = new CopyOnWriteArrayList<>();
//        for (int i = 1; i <= 30; i++) {
//            new Thread(() -> {
//                list.add(UUID.randomUUID().toString().substring(0, 8));
//                System.out.println(list);
//            }, String.valueOf(i)).start();
//        }
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
