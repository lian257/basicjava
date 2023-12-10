package com.stx.day20231204;

import java.time.LocalDate;

/**
 * @ClassName 闰年
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/4 14:12
 * @Version 1.0
 */
public class LeapYear {
    public static void main(String[] args) {
        //闰年
        LocalDate ld = LocalDate.of(2000,3,2);
        System.out.println(ld.isLeapYear());
    }
}