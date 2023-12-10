package com.stx.day20231206.myfile;

import java.io.File;

/**
 * @ClassName FileDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/6 15:06
 * @Version 1.0
 */
public class FileDemo1 {
    public static void main(String[] args) {
        /*
        public File(String pathname)
        根据文件路径创建文件对象
        public File(String parent, String child)
        根据父路径名字符串和子路径名字符串创建文件对象
        public File(File parent, String child)
        根据父路径对应文件对象和子路径名字符串创建文件对象

         */

        // 1.根据文件路径创建文件对象
        String str = "D:\\javaworkplace\\basicjava\\stxjava\\src\\com\\stx\\day20231206\\myfile\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        //2.父级 + 子级
        String parent = "D:\\javaworkplace\\basicjava\\stxjava\\src\\com\\stx\\day20231206\\myfile";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);

        File f4 = new File(parent + "\\",child);
        System.out.println(f4);

        // 拼接
        File parent2 = new File("D:\\javaworkplace\\basicjava\\stxjava\\src\\com\\stx\\day20231206\\myfile");
        String child2 = "a.txt";
        File f3 = new File(parent2,child2);
        System.out.println(f3);
    }
}