package com.stx.day20231128.demo2;

/**
 * @ClassName PingPongCoach
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 14:53
 * @Version 1.0
 */
public class PingPongCoach extends Coach implements English{
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在学习英语");
    }
}