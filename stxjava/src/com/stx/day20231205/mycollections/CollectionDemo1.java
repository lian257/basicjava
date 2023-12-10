package com.stx.day20231205.mycollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @ClassName CollectionDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/5 21:19
 * @Version 1.0
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,23,43,435,45,45,6);
        Collections.sort(list);
        System.out.println(list);
    }
}