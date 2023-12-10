package com.stx.day20231205.myset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @ClassName A03_TreeSetDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/5 17:13
 * @Version 1.0
 */
public class A03_TreeSetDemo1 {
    public static void main(String[] args) {
        // 1.创建TreeSet集合对象
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(1);
        ts.add(2);
        ts.add(7);

//        System.out.println(ts);
        // 遍历
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            int i = it.next();
            System.out.println(i);
        }

        for (Integer t : ts) {
            System.out.println(t);
        }


    }
}