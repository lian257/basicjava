package com.stx.day20231204;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * @ClassName DayLive
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/4 11:25
 * @Version 1.0
 */
public class DayLive {
    public static void main(String[] args) throws ParseException {
        // 计算活的时间

        // jdk7
        // 出生的毫秒值
        String birthDay = "2001年10月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        Date date = sdf.parse(birthDay);
        long birthdayTime = date.getTime();
        // 获取 当前
        long todayTime = System.currentTimeMillis();

        // 计算间隔
        long time = todayTime - birthdayTime;
        System.out.println(time/ 1000/ 60 /60 /24);

        //jdk8
        LocalDate ld1 = LocalDate.of(2001,10,1);
        LocalDate ld2 = LocalDate.now();

        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);
    }
}