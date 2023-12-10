package com.stx.day20231205.mymap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName A01_MapDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/5 17:28
 * @Version 1.0
 */
public class A01_MapDemo1 {
    public static void main(String[] args) {
        // 创建map集合对象
        Map<String, String> m = new HashMap<>();

        // 2.添加元素

        m.put("郭靖","黄蓉");
        m.put("尹志平","小龙女");

        // 3.获取所有键 把这些键放到一个单列集合中
        Set<String> keys =m.keySet();

        // 遍历单列集合
        for(String key:keys){
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }
    }
}