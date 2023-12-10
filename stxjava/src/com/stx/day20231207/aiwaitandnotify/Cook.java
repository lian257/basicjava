package com.stx.day20231207.aiwaitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @ClassName Cook
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 18:54
 * @Version 1.0
 */
public class Cook extends Thread{
    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            // 不断从阻塞列队中取面条
            try {
                String food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}