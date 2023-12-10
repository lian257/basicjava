package com.stx.day20231204.search;

/**
 * @ClassName A01_BubbleDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/4 15:30
 * @Version 1.0
 */
public class A01_BubbleDemo {
    public static void main(String[] args) {
        /**
         * // 冒泡核心思想
         * 1. 相邻元素两两比较 大的放右边 小的放左边
         * 2. 第一轮结束，最大值确定 第二轮可以少一次循环
         * 3. 数组中有n个数据 总共执行n-1次
         */
        int[] arr = {4, 3, 1, 5, 7};

        // 冒泡
        //外循环：循环次数  // -1 越界
        for (int j = 0; j < arr.length - 1; j++) {
            // 内循环 ：每一轮寻找当前最大值
            // - i 每一轮次数应该比上一轮少
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        printArr(arr);

        // 选择排序
        /*
            这里每次找最小的值进行交换
         */
        int[] arr1 = {1,5,3,7,2};
        for (int i = 0; i < arr1.length -1;i++) {
            for (int j = i +1; j < arr1.length; j++) {
                if(arr1[i] > arr1[j]){
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        printArr(arr1);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}