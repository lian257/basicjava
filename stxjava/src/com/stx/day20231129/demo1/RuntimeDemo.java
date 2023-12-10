package com.stx.day20231129.demo1;

import java.io.IOException;

/**
 * @ClassName RuntimeDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/29 15:39
 * @Version 1.0
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        Runtime.getRuntime().exec("calc");
    }
}
