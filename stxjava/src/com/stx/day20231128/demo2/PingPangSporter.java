package com.stx.day20231128.demo2;

/**
 * @ClassName PingPangSporter
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 14:47
 * @Version 1.0
 */
public class PingPangSporter extends Sporter implements English{
    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员要学习英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习打乒乓球");
    }
}