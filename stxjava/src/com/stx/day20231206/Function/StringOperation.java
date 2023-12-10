package com.stx.day20231206.Function;

/**
 * @ClassName StringOperation
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/12/6 11:10
 * @Version 1.0
 */
public class StringOperation {
    public boolean stringJudge(String s){
        return s.startsWith("张") && s.length() == 3;
    }
}