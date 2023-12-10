package com.stx.day20231207.waitandnotify;

/**
 * @ClassName Desk
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 17:28
 * @Version 1.0
 */
public class Desk {
    // 作用:控制生产者和消费者的执行

    // 桌子上是否有面条
    public static int foodFlag = 0;

    // 总个数
    public static int count = 10;

    // 锁对象
    public static Object lock = new Object();
}