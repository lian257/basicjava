package com.stx.day20231204.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName A02_CollectionDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/5 10:17
 * @Version 1.0
 */
public class A02_CollectionDemo1 {
    public static void main(String[] args) {
        //迭代器遍历
        /*
        迭代器遍历相关的三个方法:
        Iterator<E> iterator() :获取一个迭代器对象
        boolean hasNext( ):判断当前指向的位置是否有元素
        E next( ):获取当前指向的元素并移动指针
         */

        // 1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("sss");
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        // 2.获取迭代器对象/
        // 迭代器好比一个箭头 默认指向集合0索引
        Iterator<String> it = coll.iterator();
        // 3.循环遍历不断获取集合中的元素
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        // 当循环结束之后，迭代器的指针已经指向最后没有元素的位置
            //迭代器遍历结束指针不会复位
        //如果需要在遍历需要再次获取一个新的迭代器
        Iterator<String> it1 = coll.iterator();
        while(it1.hasNext()){
            String s1 = it1.next();
            System.out.println(s1);
        }

    }
}