package com.yl.builder.improve;

/**
 * @author candk
 * @Description
 * @date 4/16/21 - 8:44 AM
 */
public abstract class HouseBuilder {
    private House house = new House();

    public abstract void buildBaisc();

    public abstract void buildwalls();

    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
