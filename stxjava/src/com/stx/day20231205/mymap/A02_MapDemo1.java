package com.stx.day20231205.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName A02_MapDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/5 18:40
 * @Version 1.0
 */
public class A02_MapDemo1 {
    public static void main(String[] args) {
        // 1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        // 2.添加元素
        map.put("1", "ds");
        map.put("2", "xxx");
        map.put("3", "sdf");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        // 3.遍历entries 集合
        for (Map.Entry<String, String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}