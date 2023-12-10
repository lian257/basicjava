package com.stx.day20231204.search;

import java.util.ArrayList;

/**
 * @ClassName A01_BasicSearchDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/4 14:27
 * @Version 1.0
 */
public class A01_BasicSearchDemo {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,1,6,7,8,9};
        int num = 1;
        System.out.println(search(a,num));
    }
    public static ArrayList search(int[] search,int number){
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<search.length;i++){
            if(search[i] == number){
                list.add(i);
            }
        }
        return list;
    }
}