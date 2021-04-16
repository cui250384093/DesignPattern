package com.yl.builder;

/**
 * @author candk
 * @Description
 * @date 4/16/21 - 8:34 AM
 */
public class CommonHouse extends AbstractHouse {


    @Override
    public void buildBaisc() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
