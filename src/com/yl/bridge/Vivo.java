package com.yl.bridge;

/**
 * @author candk
 * @Description
 * @date 4/25/21 - 9:53 AM
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("vivo open");
    }

    @Override
    public void close() {
        System.out.println("vivo close");
    }

    @Override
    public void call() {
        System.out.println("vivo call");
    }
}
