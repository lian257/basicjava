package com.stx.day20231128.demo1;

/**
 * @ClassName Rabbit
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 14:13
 * @Version 1.0
 */
public class Rabbit extends Animal{
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃萝卜");
    }


}