package com.stx.day20231205.args;

/**
 * @ClassName ArgsDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/5 21:09
 * @Version 1.0
 */
public class ArgsDemo {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3);
        System.out.println(sum);
    }

    private static int getSum(int...args) {
        int sum = 0;
        for(int i : args) {
            sum += i;
        }
        return sum;
    }
}