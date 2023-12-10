package com.stx.day20231128.demo5;

/**
 * @ClassName Test
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 16:30
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swim() {
                System.out.println("sd");
            }
        };

        new Animal(){
            @Override
            public void eat() {
                System.out.println("重写eat");
            }
        };

        method(new Animal() {
            @Override
            public void eat() {
                System.out.println("cho");
            }
        });

        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("sd");
            }
        };
        s.swim();

    }
    public static void method(Animal a){
        a.eat();
    }
}