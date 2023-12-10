package com.stx.day20231207.threadcase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName ThreadDemo3
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 16:39
 * @Version 1.0
 */
public class ThreadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        多线程的第三种实现方式:
        特点:可以获取到多线程运行的结果
            1创建一个类MyCallable实现Callable接口
            2.重写call (是有返回值的，表示多线程运行的结果)
            3.创建MyCallable的对象( 表示多线程要执行的任务)
            4.创建Future的对象(作用管理多线程运行的结果)
         */

        // 创建MyCallable 对象
        MyCallable mc = new MyCallable();
        // 创建FutureTask 对象 （作用：管理多线程运行结果）
        FutureTask<Integer> ft = new FutureTask<>(mc);
        // 创建线程对象
        Thread t1 = new Thread(ft);
        // 启动线程
        t1.start();

        // 管理多线程运行结果
        Integer re = ft.get();
        System.out.println(re);
    }
}