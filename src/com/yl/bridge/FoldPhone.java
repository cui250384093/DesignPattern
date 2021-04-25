package com.yl.bridge;

/**
 * @author candk
 * @Description
 * @date 4/25/21 - 9:48 AM
 */
public class FoldPhone extends Phone {

    public FoldPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("fold phone");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("fold phone");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("fold phone");
    }
}
