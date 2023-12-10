package com.stx.day20231204.search;

/**
 * @ClassName A03_QuickSortDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/4 18:48
 * @Version 1.0
 */
public class A03_QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 7, 5, 9, 1, 10};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
    /*
       参数二: 数组开始索引
       参数三: 数组的结束索引
     */

    public static void quickSort(int[] arr, int i, int j) {
        // 定义两个变量记录查找的范围
        int start = i;
        int end = j;

        if(start > end){
            return;
        }

        // 记录基准数
        int baseNumber = arr[i];

        while (start != end) {
            // 利用end ,从后往前找
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            // 利用start,从前往后找 比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            // 把 end 和 start 指向的元素交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //确定范围左边
        quickSort(arr, i, start - 1);
        // 右边
        quickSort(arr, start + 1, j);
    }
}