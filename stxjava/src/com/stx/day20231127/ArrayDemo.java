package com.stx.day20231127;

/**
 * @ClassName ArrayDemo
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/27 16:41
 * @Version 1.0
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8};
        String str = ArrayUtil.printArr(array1);
        System.out.println(str);

        double[] array2 = {1.3,1.4,1.5,1.6,1.7};
        double average = ArrayUtil.getAverage(array2);
        System.out.println(average);

    }
}