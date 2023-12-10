package com.stx.day20231207.threadcase;

/**
 * @ClassName ThreadDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 16:21
 * @Version 1.0
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        /*
            多线程启动方式一:
            1. 自定义类继承Thread
            2. 重写run方法
            3. 创建子类对象 并启动线程
         */
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("MyThread1");
        t2.setName("MyThread2");
        // 开启线程
        t1.start();
        t2.start();
    }
}