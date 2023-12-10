package com.stx.day20231128.demo1;

/**
 * @ClassName Test
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 14:20
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("xiaomi",1);
        f.eat();
        f.swim();

        Rabbit rabbit = new Rabbit("花花",1);
        rabbit.eat();

        Dog dog = new Dog("灰灰",4);
        dog.eat();
        dog.swim();
    }
}