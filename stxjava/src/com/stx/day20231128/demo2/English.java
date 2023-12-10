package com.stx.day20231128.demo2;

public interface English {
    public abstract void speakEnglish();

    public default void show(){
        System.out.println("接口默认方法");
    }
}
