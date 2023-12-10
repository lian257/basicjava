package com.stx.day20231128.demo2;

/**
 * @ClassName Test
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 14:54
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        BasketballCoach basketballCoach = new BasketballCoach("刘教练",2);
        basketballCoach.teach();

        PingPangSporter pang = new PingPangSporter();
        pang.speakEnglish();
        pang.study();
    }
}