package com.yl.bridge;

/**
 * @author candk
 * @Description
 * @date 4/24/21 - 3:21 PM
 */
public abstract class Phone {

    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void close() {
        brand.close();
    }

    public void call() {
        brand.call();
    }
}
