package com.stx.day20231207.threadcase;

import java.util.concurrent.Callable;

/**
 * @ClassName MyCallable
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 16:40
 * @Version 1.0
 */
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        // 1 ~ 100 和
        int sum = 0;
        for (int i = 0; i <100;i++){
            sum = sum + i;
        }
        return sum;
    }
}