package com.stx.day20231128.demo1;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 14:19
 * @Version 1.0
 */
public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗狗在游泳");
    }
}