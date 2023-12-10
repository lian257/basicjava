package com.stx.day20231204.search;

/**
 * @ClassName A02_RecursionDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/4 17:08
 * @Version 1.0
 */
public class A02_RecursionDemo {
    public static void main(String[] args) {
        // 递归求和
        System.out.println(getSum(4));
    }

    public static int getSum(int num) {
        if(num == 1){
            return 1;
        }

        return num + getSum(num - 1);
    }
}