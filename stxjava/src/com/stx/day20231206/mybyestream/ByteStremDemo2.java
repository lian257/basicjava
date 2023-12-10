package com.stx.day20231206.mybyestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName ByteStremDemo2
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/6 16:15
 * @Version 1.0
 */
public class ByteStremDemo2 {
    public static void main(String[] args) throws IOException {
        // FileInputStream

        // 1.创建对象
        FileInputStream fis = new FileInputStream("D:\\javaworkplace\\basicjava\\stxjava\\src\\com\\stx\\day20231206\\myfile\\a.txt");
        // 2.循环读取
        int read = fis.read();
        int flags;
        while ((flags = fis.read()) != -1) {
            System.out.println(flags);
        }
        // 3.关闭释放资源
        fis.close();

    }
}