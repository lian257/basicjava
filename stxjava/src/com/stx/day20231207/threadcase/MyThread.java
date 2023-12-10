package com.stx.day20231207.threadcase;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 16:18
 * @Version 1.0
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        // 执行器
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}