package com.stx.day20231127.demo2;

import java.util.ArrayList;

/**
 * @ClassName StudentUtil
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/27 17:13
 * @Version 1.0
 */
public class StudentUtil {
    public StudentUtil() {
    }

    public static int getMaxAge(ArrayList<Student> students){
        /**
         * 参照物
         */
        int max = students.get(0).getAge();
        for(int i = 1; i < students.size(); i++){
            int tempAge = students.get(i).getAge();
            if(tempAge > max){
                max = tempAge;
            }
        }
        return max;
    }
}