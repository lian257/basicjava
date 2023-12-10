package com.stx.day20231206.mybyestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileByteStreamCopy
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/6 16:36
 * @Version 1.0
 */
public class FileByteStreamCopy {
    public static void main(String[] args) throws IOException {
        // 文件拷贝
        //1.创建对象

        FileInputStream fis = new FileInputStream("D:\\Desktop\\testFile\\aly.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\javaworkplace\\basicjava\\stxjava\\src\\com\\stx\\day20231206\\mybyestream\\aly.jpg");

        // 2. copy
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        // 3.释放
        fos.close();
        fis.close();
    }
}