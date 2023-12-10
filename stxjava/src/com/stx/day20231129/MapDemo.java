package com.stx.day20231129;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/29 10:13
 * @Version 1.0
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Dog> dogMap = new HashMap();
        Dog dog = new Dog("小狗狗",2);
        Dog dog1 = new Dog("小土狗",2);

        dogMap.put("小狗狗",dog);
        Dog dog2 = dogMap.get("小狗狗");
        System.out.println(dog2);
    }
}