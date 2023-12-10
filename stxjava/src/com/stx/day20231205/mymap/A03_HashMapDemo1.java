package com.stx.day20231205.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * @ClassName A03_HashMapDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/5 18:56
 * @Version 1.0
 */
public class A03_HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<>();

        Student s1 = new Student("zhansan",22);
        Student s2 = new Student("limix",22);
        Student s3 = new Student("wangwu",23);

        // 添加元素
        hm.put(s1,"江苏");
        hm.put(s2,"重庆");
        hm.put(s3,"山东");

        // 遍历集合
        Set<Student>  keys = hm.keySet();
        for(Student s : keys){
            String value = hm.get(s);
            System.out.println(s + "=" + value);
        }

        System.out.println("------------------------");

        Set<Map.Entry<Student,String>> entries = hm.entrySet();
        for(Map.Entry<Student,String> entry : entries){
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" +value);
        }
        System.out.println("------------------------");
        // lamber
        hm.forEach((Student,s) -> System.out.println(Student + "=" + s));

    }
}