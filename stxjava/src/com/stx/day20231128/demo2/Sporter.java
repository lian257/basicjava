package com.stx.day20231128.demo2;

/**
 * @ClassName Sporter
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 14:41
 * @Version 1.0
 */
public abstract class Sporter extends Person{
    public Sporter() {
    }

    public Sporter(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}