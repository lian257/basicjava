package com.stx.day20231128.demo2;

/**
 * @ClassName Coach
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 14:44
 * @Version 1.0
 */
public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}