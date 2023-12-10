package com.stx.day20231207.aiwaitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @ClassName Foodie
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 18:54
 * @Version 1.0
 */
public class Foodie extends Thread{
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            // 不断的把面条放入阻塞列队中
            try {
                queue.put("面条");
                System.out.println("厨师制作了一碗面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}