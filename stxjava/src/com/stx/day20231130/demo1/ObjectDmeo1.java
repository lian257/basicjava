package com.stx.day20231130.demo1;

import java.util.Objects;

/**
 * @ClassName ObjectDmeo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/30 20:10
 * @Version 1.0
 */
public class ObjectDmeo1 {
    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = new Student("xa",12);

        boolean result = Objects.equals(s1, s2);
        System.out.println(result);
    }
}