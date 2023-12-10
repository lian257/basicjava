package com.stx.day20231204;

/**
 * @ClassName ToBinary
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/4 11:07
 * @Version 1.0
 */
public class ToBinary {
    public static void main(String[] args) {
        // 实现十进制转二进制
        System.out.println(toBinaryString(10));
    }

    public static String toBinaryString(int number){
        // 不断除于2 得到余数 一直到商为零结束 而结果为余数倒着拼接

        StringBuilder sb = new StringBuilder();

        while(true){
            if(number == 0){
                break;
            }
            //获取余数
            int remaindar = number %2;
            System.out.println(remaindar);
            sb.insert(0,remaindar);
            number = number / 2;
        }
        return sb.toString();
    }
}