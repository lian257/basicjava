package com.stx.day20231207.tcpserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName Server
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 20:50
 * @Version 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //TCP协议，发送数据
        //1.创建ServerSocket
        ServerSocket ss = new ServerSocket(8080);

        // 监听客户端链接
        Socket socket = ss.accept();

        // 从链接通道中获取输入流读取数据
//        InputStream is = socket.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char)b);
        }
        // 释放
        socket.close();
        ss.close();
    }
}