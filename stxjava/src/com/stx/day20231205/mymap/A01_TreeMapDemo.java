package com.stx.day20231205.mymap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @ClassName A01_TreeMapDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/5 20:52
 * @Version 1.0
 */
public class A01_TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1 当前要添加的元素
                // o2 表示已经在红黑树中存在的元素
                return o1 - o2;
            }
        });

        tm.put(3,"雷碧");
        tm.put(4,"九个核桃");
        tm.put(5,"康师傅");

        System.out.println(tm);
    }
}