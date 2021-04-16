package com.yl.builder.improve;

/**
 * @author candk
 * @Description
 * @date 4/16/21 - 8:50 AM
 */
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBaisc() {
        System.out.println("高层房子打地基");
    }

    @Override
    public void buildwalls() {
        System.out.println("高层房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高层房子封顶");
    }
}
