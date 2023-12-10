package com.stx.day20231207.intaddress;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @ClassName ReceiveMessageDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 20:25
 * @Version 1.0
 */
public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        // Udp接收数据

        DatagramSocket ds = new DatagramSocket(8080);

        // 接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        //该方法是阻塞的
        //程序执行到这一步的时候，会在这里死等.
        //等发送端发送消息
        ds.receive(dp);

        //解析
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println("接收到的数据" + new String(data,0,len));
        System.out.println("该数据从"+ address + "电脑" + port + "端口");

        // 4 释放
        ds.close();
    }
}