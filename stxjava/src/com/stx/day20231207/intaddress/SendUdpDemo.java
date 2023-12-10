package com.stx.day20231207.intaddress;

import java.io.IOException;
import java.net.*;

/**
 * @ClassName SendUdpDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 20:17
 * @Version 1.0
 */
public class SendUdpDemo {
    public static void main(String[] args) throws IOException {
        // Udp发送数据
        // 创建DatagramSocket对象
        /**
         * 细节:
         * 绑定端口，以后我们就是通过这个端口往外发送
         * 空参:所有可用的端口中随机-一个进行使用
         * 有参:指定端口号进行绑定
         */
        DatagramSocket ds = new DatagramSocket();

        // 打包数据
        String str = "hello world";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 8080;

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

        // 发送数据
        ds.send(dp);

        // 释放
        ds.close();
    }
}