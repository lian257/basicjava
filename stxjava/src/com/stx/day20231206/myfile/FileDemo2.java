package com.stx.day20231206.myfile;

import java.io.File;

/**
 * @ClassName FileDemo2
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/6 15:23
 * @Version 1.0
 */
public class FileDemo2 {
    public static void main(String[] args) {
        // 创建File对象
        File f = new File("D:\\javaworkplace\\basicjava\\stxjava\\src\\com\\stx\\day20231206\\myfile");
        File[] files = f.listFiles();
        for(File file : files){
            System.out.println(file);
        }
    }
}