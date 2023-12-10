package com.stx.day20231127;

/**
 * @ClassName Student
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/27 16:06
 * @Version 1.0
 */
public class Student {
    public static String teacherName;
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study() {
        System.out.println(name + "正在学习~~");
    }

    public void show() {
        System.out.println(name + ","+ age + ","+ gender + "," + teacherName);
    }
}