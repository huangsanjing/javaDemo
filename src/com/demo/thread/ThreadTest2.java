package com.demo.thread;/**
 * @ClassName ThreadTest2.java
 * @author admin
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年03月30日 15:17:00
 */

/**
 * @author hg
 * @date 2022年03月30日 15:17
 */
public class ThreadTest2 {


    public static void main(String[] args) {

        Thread thread1 = new Thread(new SynWork("thread1"));
        Thread thread2 = new Thread(new SynWork("thread2"));

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

        System.out.println("thread1-3状态："+thread1.getState().toString());
        System.out.println("thread2-3状态："+thread2.getState().toString());

    }

    static  class SynWork implements  Runnable {

        private String name;

        public SynWork(String name) {
            this.name = name;
        }

        @Override
        public void run() {

            synchronized (SynWork.class){
                try {
                    Thread.sleep(1*100);
                    System.out.println(name+"执行成功！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                }
            }
        }
    }

}
