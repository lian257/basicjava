package com.stx.day20231127;

/**
 * @ClassName StudentTest
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/27 16:12
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("male");
        s1.teacherName = "ds";

        s1.show();
        s1.study();

        Student s2 = new Student();
        s2.setName("xia");
        s2.setAge(23);
        s2.setGender("male");

        s2.show();
        s2.study();


    }
}