package com.stx.day20231206.exception;

/**
 * @ClassName ExceptionDemo2
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/6 14:10
 * @Version 1.0
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {

        int[] arr = null;

        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
        System.out.println(max);
    }

    private static int getMax(int[] arr) {
        if(arr == null) {
            throw new NullPointerException();
        }

        if(arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}