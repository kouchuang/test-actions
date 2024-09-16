package cn.com.rpf.security.securitydemo1.test;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 阻塞demo
 *
 * @author rpf
 * @version 1.0
 * @date 2021/10/18 18:04
 */
public class BlockingQueueDemo {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(arrayBlockingQueue.add("a"));
        System.out.println(arrayBlockingQueue.add("b"));
        System.out.println(arrayBlockingQueue.add("c"));
        System.out.println(arrayBlockingQueue.element());
        System.out.println(arrayBlockingQueue.remove());
        System.out.println(arrayBlockingQueue.remove());
        System.out.println(arrayBlockingQueue.remove());
    }
}
