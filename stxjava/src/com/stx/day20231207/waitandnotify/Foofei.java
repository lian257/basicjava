package com.stx.day20231207.waitandnotify;

/**
 * @ClassName Foofie
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 17:27
 * @Version 1.0
 */
public class Foofei extends Thread{
    @Override
    public void run() {
        /**
         * 1 循环
         * 2 同步代码块
         * 3 判断共享数据是否到了末尾(到了末尾)
         * 4 判断共享数据是否到了末尾(没有到末尾，执行核心逻辑)
         */

        while (true) {
            synchronized (Desk.lock){
                if(Desk.count == 0) {
                    break;
                }else {
                    // 判断桌子上是否一面条
                    if(Desk.foodFlag == 0) {
                        // 如果没有
                        try {
                            Desk.lock.wait(); // 让当前线程跟锁进行绑定
                        }catch(InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        // 吃的总数-1
                        Desk.count --;
                        // 如果有就开吃
                        System.out.println("吃货在吃面条" + Desk.count + "碗！！！");
                        // 吃完，唤醒厨师再做
                        Desk.lock.notifyAll();
                        // 修改桌子状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}