package com.yl.builder;

/**
 * @author candk
 * @Description
 * @date 4/16/21 - 8:32 AM
 */
public abstract class AbstractHouse {

    public abstract void buildBaisc();

    public abstract void buildWall();

    public abstract void roofed();

    public void bulid() {
        buildBaisc();
        buildWall();
        roofed();
    }
}
