package com.stx.day20231205.myset;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName A01_SetDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/5 16:17
 * @Version 1.0
 */
public class A01_SetDemo1 {
    public static void main(String[] args) {
        // 1.create a new set
        Set<String> set = new HashSet<>();
        // 2.添加元素
        set.add("aa");
        set.add("bb");
        set.add("cc");
        set.add("dd");

        //3.打印
        // 无序
        System.out.println(set);

        // 迭代器遍历
        /*
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key);
        }
         */
        // 增强for
//        for (String s : set) {
//            System.out.println(set);
//        }

        set.forEach(s -> System.out.println(s));

    }
}