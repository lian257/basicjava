package com.stx.day20231130.prouctcomsumerdemo;

/**
 * @ClassName Prodecter
 * @Description TODO
 * @Author XiaoHu
 * @Date 2023/11/30 15:10
 * @Version 1.0
 */
public class Prodecter extends Thread{
    private Prodect prodect;

    public Prodect getProdect() {
        return prodect;
    }

    public void setProdect(Prodect prodect) {
        this.prodect = prodect;
    }

    @Override
    public void run() {
        while (true) {
            prodect.getItem();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}