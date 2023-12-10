package com.stx.day20231206.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

/**
 * @ClassName FunctionDemo2
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/6 10:06
 * @Version 1.0
 */
public class FunctionDemo2 {
    public static void main(String[] args) {
        // 1.创建集合
        ArrayList<String> list = new ArrayList<>();
        // 2.添加数据
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");
        // 3.过滤数据<只要以"张"开头,而且名字是三个字>
        list.stream().filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));

        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return  s.startsWith("张") && s.length() == 3;

            }
        }).forEach(s -> System.out.println(s));

        // 方法引用
        StringOperation so = new StringOperation();
        list.stream().filter(so::stringJudge).forEach(s -> System.out.println(s));

        // 本类引用
        StringOperation so2 = new StringOperation();
        list.stream().filter(new FunctionDemo2()::stringJudge).forEach(s -> System.out.println(s));
    }
    public boolean stringJudge(String s){
        return s.startsWith("张") && s.length() == 3;
    }
}