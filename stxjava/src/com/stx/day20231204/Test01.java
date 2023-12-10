package com.stx.day20231204;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName Test01
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/4 10:44
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("input");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            // 异常数据过滤
            if(num < 1 || num> 100 ){
                System.out.println("不符合");
                continue;
            }
            list.add(num);
            int sum = getSum(list);

            if(sum > 200){
                System.out.println("满足");
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int li = 0; li < list.size(); li++) {
            int num = list.get(li);
            sum = sum + num;
        }
        return sum;
    }
}