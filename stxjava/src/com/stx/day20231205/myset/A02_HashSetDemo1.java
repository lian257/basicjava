package com.stx.day20231205.myset;

/**
 * @ClassName A02_HashSetDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/5 16:38
 * @Version 1.0
 */
public class A02_HashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("sxk",23);
        Student s2 = new Student("sxk",23);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}