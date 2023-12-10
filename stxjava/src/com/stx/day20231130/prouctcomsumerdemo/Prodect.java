package com.stx.day20231130.prouctcomsumerdemo;

/**
 * @ClassName Prodect
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/30 15:07
 * @Version 1.0
 */
public class Prodect {
    private int item;

    public synchronized void getItem() {
        System.out.println("getItem" + item);
    }

    public synchronized void setItem() {
        item++;
        this.item = item;
        System.out.println("setItem" + item);
    }
}