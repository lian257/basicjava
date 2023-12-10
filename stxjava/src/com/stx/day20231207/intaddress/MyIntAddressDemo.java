package com.stx.day20231207.intaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName MyIntAddressDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/7 19:59
 * @Version 1.0
 */
public class MyIntAddressDemo {
    public static void main(String[] args) throws UnknownHostException {

        // 获取IntAddress 对象
        InetAddress myAddress = InetAddress.getByName("aolian");
        System.out.println(myAddress); // aolian/192.168.31.7

        String hostName = myAddress.getHostName();
        System.out.println(hostName);

        String ip = myAddress.getHostAddress();
        System.out.println(ip); // 192.168.31.7

    }
}