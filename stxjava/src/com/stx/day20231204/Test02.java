package com.stx.day20231204;

/**
 * @ClassName Test02
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/4 10:58
 * @Version 1.0
 */
public class Test02 {
    /**
     * 实现parseInt 效果
     */
    public static void main(String[] args) {
        String str = "12343435";

        // 校验字符串
        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("数据格式错误");
        }else{
            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                number = number * 10 + c;

            }
            System.out.println(number);
            System.out.println(number + 1);
        }
    }
}