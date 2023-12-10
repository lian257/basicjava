package com.stx.day20231128.demo2;

/**
 * @ClassName BasketballCoach
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 14:51
 * @Version 1.0
 */
public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教打篮球");
    }

}