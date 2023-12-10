package com.stx.day20231205.mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @ClassName RandomRollCall
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/5 21:29
 * @Version 1.0
 */
public class RandomRollCall {
    public static void main(String[] args) {
        // 70% 男 30% 女

        // 创建集合
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);
        //打乱集合中的数据
        Collections.shuffle(list);
        // 随机抽取
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        int number = list.get(index);
        System.out.println(number);

        //创建两个集合存男女名字
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList,"饭桶","小米","小明","小流","方桶","珠穆朗玛峰","肚子痛");
        Collections.addAll(girlList,"理想城","理财","sy","小蔡");

        //判断抽取
        if(number == 1){
            // boy
            int boyIndex = rand.nextInt(boyList.size());
            String name = boyList.get(boyIndex);
            System.out.println(name);
        }else {
            // girl
            int girlIndex = rand.nextInt(girlList.size());
            String name = girlList.get(girlIndex);
            System.out.println(name);
        }

    }
}