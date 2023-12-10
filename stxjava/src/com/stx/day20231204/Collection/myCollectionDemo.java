package com.stx.day20231204.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * @ClassName myCollectionDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/4 21:17
 * @Version 1.0
 */
public class myCollectionDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        // 1.添加元素
        // 如果往list系列集合添加数据 那么方法永远返回true 因为list集合允许元素重复
        // 如果往Set系列集合中添加数据 set数据不允许重复
        coll.add("sss");
        System.out.println(coll);

        // Collection 里面定义的是共性的方法 此时不能通过索引删除 只能通过对象删除
        // 返回值为Boolean
        coll.add("ass");
        boolean result = coll.remove("ass");
        System.out.println(result);

        // 包含
        // 底层是依赖equal方法判断是否存在
        // so 自定义对象需要重写equals
        /*
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
         */

        coll.forEach(s -> System.out.println(s));

    }
}