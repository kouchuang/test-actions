package cn.com.rpf.security.securitydemo1.pool;

import java.util.concurrent.*;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/10/22 11:01
 */
public class MyThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(2, 5, 1L, TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
        try {
            for (int i = 1; i < 10; i++) {
                pool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t办理业务！");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pool.shutdown();
        }
    }

    private static void extracted() {
        // 一池五线程
//        ExecutorService pool = Executors.newFixedThreadPool(5);
        // 一池一线程
        ExecutorService pool = Executors.newSingleThreadExecutor();
        try {
            for (int i = 1; i <= 10; i++) {
                pool.execute(() -> System.out.println(Thread.currentThread().getName() + "\t办理业务"));
            }
        } catch (Exception e) {

        } finally {
            pool.shutdown();
        }
    }
}
