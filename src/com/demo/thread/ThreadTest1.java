package com.demo.thread;/**
 * @ClassName ThreadTest1.java
 * @author admin
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月30日 14:29:00
 */

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hg
 * @date 2022年03月30日 14:29
 */
public class ThreadTest1 {

    static  final  ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        System.out.println("111111");
        Thread thread1 = new Thread(new Work("thread1"));
        Thread thread2 = new Thread(new Work("thread2"));

        System.out.println("thread1-1状态："+thread1.getState().toString());
        System.out.println("thread2-1状态："+thread2.getState().toString());

        thread1.start();
        thread2.start();

        System.out.println("thread1-2状态："+thread1.getState().toString());
        System.out.println("thread2-2状态："+thread2.getState().toString());


        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread1状态："+thread1.getState().toString());
        System.out.println("thread2状态："+thread2.getState().toString());
    }


    static  class  Work implements  Runnable {

        private String name;

        public Work(String name) {
            this.name = name;
        }

        @Override
        public void run() {

            try {
               lock.lock();

               Thread.sleep(1*1000);
                System.out.println(name+"执行完成");

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

}
