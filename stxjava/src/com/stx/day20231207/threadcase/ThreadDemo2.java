package com.stx.day20231207.threadcase;

/**
 * @ClassName ThreadDemo2
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 16:30
 * @Version 1.0
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        /*
        多线程的第二二种启动方式:
        1.自己定义一一个类实现Runnable接口
        2.重写里面的run方法
        3.创建自己的类的对象
        4.创建-一个Thread类的对象，并开启线程
         */

        // 创建MyRun的对象
        MyRun myRun = new MyRun();
        // 创建线程对象
        Thread t1 = new Thread(myRun);
        Thread t2 = new Thread(myRun);

        // 设置名字
        t1.setName("myRun1");
        t2.setName("myRun2");

        // 开启线程
        t1.start();
        t2.start();
    }
}