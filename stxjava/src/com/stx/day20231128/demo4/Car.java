package com.stx.day20231128.demo4;

/**
 * @ClassName Car
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/28 15:34
 * @Version 1.0
 */
public class Car {
    private String carName;
    private int carAge;
    private String carColor;
    Engine engine = new Engine();
    public void show(){
        System.out.println(engine.engineName);
    }

    class Engine {
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(carName + "engineName=" + engineName);
        }
    }

    public Engine getInstance(){
        return new Engine();
    }
}