package com.stx.day20231206.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * @ClassName FunctionDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/6 9:32
 * @Version 1.0
 */
public class FunctionDemo1 {
    public static void main(String[] args) {
        // 静态方法引用

        //1. 创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "1", "2", "3", "4", "5", "6");

        // 2. 变为int型
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int i = Integer.parseInt(s);
                return i;
            }
        }).forEach(s -> System.out.println(s));

        // 方法需要已经存在
        //方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        //方法的功能需要把形参的字符串转换成整数
        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));
    }
}