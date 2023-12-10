package com.stx.day20231207.waitandnotify;

/**
 * @ClassName ThreadDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 17:25
 * @Version 1.0
 */
public class ThreadDemo {
    public static void main(String[] args) {
        /*
            需求:完成生产者和消费者(等待唤醒机制)的代码
            实现线程轮流交替执行的效果
         */

        // 创建线程对象
        Cook c = new Cook();
        Foofei f = new Foofei();

        c.setName("厨师");
        f.setName("吃货");

        // 开启
        c.start();
        f.start();
    }
}