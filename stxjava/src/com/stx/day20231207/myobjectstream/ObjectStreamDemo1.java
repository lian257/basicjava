package com.stx.day20231207.myobjectstream;

import java.io.*;

/**
 * @ClassName ObjectStreamDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 15:18
 * @Version 1.0
 */
public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 序列化流

        // 创建对象
        Student s1 = new Student("zhnagsan",23);
        // 创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\javaworkplace\\basicjava\\stxjava\\src\\com\\stx\\day20231206\\myfile\\a.txt"));
        // 写数据
        oos.writeObject(s1);

        // 释放
        oos.close();
    }
}