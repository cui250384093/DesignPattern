package com.yl.bridge;

/**
 * @author candk
 * @Description
 * @date 4/24/21 - 3:24 PM
 */
public class XiaoMi implements Brand {
    @Override
    public void call() {
        System.out.println("xiaomi call.");
    }

    @Override
    public void open() {
        System.out.println("xiaomi open");
    }

    @Override
    public void close() {
        System.out.println("xiaomi close");
    }


}
