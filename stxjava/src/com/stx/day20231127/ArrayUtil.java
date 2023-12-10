package com.stx.day20231127;

/**
 * @ClassName ArrayUtil
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/27 16:34
 * @Version 1.0
 */
public class ArrayUtil {
    /**
     * 私有化构造方法
     * 为了不让外界创造它的对象
     */
    private ArrayUtil() {}

    /**
     * 静态方法 方便调用
     */

    public static String printArr(int[] array){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < array.length; i++){
            if(i == array.length - 1){
                sb.append(array[i]);
            }else{
                sb.append(array[i]).append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static double getAverage(double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum/array.length;
    }



}