package com.stx.day20231128.demo1;

/**
 * @ClassName Frog
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 14:16
 * @Version 1.0
 */
public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在游泳~~");
    }
}