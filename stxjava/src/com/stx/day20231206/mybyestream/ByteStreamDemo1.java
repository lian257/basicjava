package com.stx.day20231206.mybyestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName ByteStreamDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/6 15:43
 * @Version 1.0
 */
public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*

         *演示:字节输出流File0utputStream
         *实现需求:写出一段文字到本地文件中。 (暂时不写中文)
            细节1:参数是字符串表示的路径或者是File对象都是可以的
            细节2:如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的。.
            细节3:如果文件已经存在，则会清空文件

         *实现步骤:
         *创建对象
         *写出数据
         *释放资源
         */
        // 1.创建
        FileOutputStream fos = new FileOutputStream("D:\\javaworkplace\\basicjava\\stxjava\\src\\com\\stx\\day20231206\\myfile\\a.txt",true);
        // 2.写
        String str = "Hello world!";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes);

        // 换行加一个换行符就可以了
        String wrap = "\r\n";
        byte[] bytes2 = wrap.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes2);

        String str2 = "Hello world!";
        byte[] bytes3 = str2.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes3);

        // 3.释放资源
        fos.close();
    }
}