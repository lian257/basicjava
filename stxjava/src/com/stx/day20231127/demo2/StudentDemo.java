package com.stx.day20231127.demo2;

import java.util.ArrayList;

/**
 * @ClassName StudentDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/27 17:09
 * @Version 1.0
 */
public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhab",15,"男");
        Student s2 = new Student("zhsdsab",23,"男");
        Student s3 = new Student("zhafdb",14,"男");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}