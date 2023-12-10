package com.stx.day20231207.threadcase;

/**
 * @ClassName MyRun
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 16:30
 * @Version 1.0
 */
public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            // 获取线程对象
           // Thread t = Thread.currentThread();
            System.out.println(Thread.currentThread().getName() + " :"+ "hello " + i);
        }
    }
}