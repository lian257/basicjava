package com.stx.day20231206.mybyestream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @ClassName CharSetDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 14:41
 * @Version 1.0
 */
public class CharSetDemo {
    public static void main(String[] args) throws IOException {
        String str = "ai爱你哟";
        // 编码
        byte[] bytes = str.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));

        // 解码
        String str2 = new String(bytes,"UTF-8");
        System.out.println(str2);

        // 1 创建对象并关联到本地文件
        FileReader fr = new FileReader("D:\\javaworkplace\\basicjava\\stxjava\\src\\com\\stx\\day20231206\\myfile\\a.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }

        // 释放资源
        fr.close();
    }
}