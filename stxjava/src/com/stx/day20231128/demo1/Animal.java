package com.stx.day20231128.demo1;

/**
 * @ClassName Animal
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 14:08
 * @Version 1.0
 */
public abstract class Animal {
    private String name;
    private int age;;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}