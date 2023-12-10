package com.stx.day20231205.mymap;

import java.util.LinkedHashMap;

/**
 * @ClassName A04_LinkedHashMapDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/5 20:42
 * @Version 1.0
 */
public class A04_LinkedHashMapDemo {
    public static void main(String[] args) {
        // 创建集合
        LinkedHashMap<String,Integer> lkm = new LinkedHashMap<>();

        lkm.put("a",123);
        lkm.put("a",124);
        lkm.put("b",423);
        lkm.put("c",123);

        System.out.println(lkm);
    }
}