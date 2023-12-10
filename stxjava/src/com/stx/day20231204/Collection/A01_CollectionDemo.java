package com.stx.day20231204.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName A01_CollectionDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/4 21:34
 * @Version 1.0
 */
public class A01_CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();

        Student s1 = new Student("sdh",23);
        Student s2 = new Student("df",23);

        coll.add(s1);
        coll.add(s2);

        Student s3 = new Student("df",23);
        System.out.println(coll.contains(s3));
    }
}