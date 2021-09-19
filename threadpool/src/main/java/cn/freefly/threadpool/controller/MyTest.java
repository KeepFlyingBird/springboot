package cn.freefly.threadpool.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyTest {
    //创建一个固定线程池
    private static ExecutorService executor = Executors.newFixedThreadPool(10);


    //向kafka里推送消费
    public static void push2Kafka(Object msg) {
        executor.execute(() -> {
            try {
                //模拟 占用的内存大小
                Byte[] bytes = new Byte[1024];
                System.out.println(Thread.currentThread().getName() + "-->任务放到线程池:" + msg);
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        //模拟高并发环境下  一直向线程池里面不停的塞任务 Integer.MAX_VALUE
        for (int i = 0; i < 50000; i++) {
            System.out.println(Thread.currentThread().getName() +",塞任务start..." + i);
            push2Kafka(i);
            System.out.println(Thread.currentThread().getName() +",塞任务end..." + i);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
