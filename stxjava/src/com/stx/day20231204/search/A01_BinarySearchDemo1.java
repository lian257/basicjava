package com.stx.day20231204.search;

/**
 * @ClassName A01_BinarySearchDemo1
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/4 14:41
 * @Version 1.0
 */
public class A01_BinarySearchDemo1 {
    public static void main(String[] args) {
        // 二分查找
        int[] arr = {7,23,54,67,78,99,101};
        int number = 78;
        System.out.println(binarySearch(arr, number));
    }
    public static int binarySearch(int[] arr,int number){
        // 定义两个变量记录要查找的范围
        int min = 0;
        int max = arr.length - 1;

        while (true){
            if(min > max){
                return -1;
            }
            // min and max 中间位置
            int mid = (min + max) / 2;
            // 拿mid 指向元素根查找元素比较
            if(arr[mid] > number){
                // number 在 mid 的左边
                max = mid - 1;
            }
            else if(arr[mid] < number){
                //  number 在 mid 右边
                min = mid + 1;
            }
            else {
                // 元素一样
                return mid;
            }
        }
    }
}