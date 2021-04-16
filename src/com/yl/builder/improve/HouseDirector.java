package com.yl.builder.improve;

/**
 * @author candk
 * @Description
 * @date 4/16/21 - 8:52 AM
 */
public class HouseDirector {

    HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBaisc();
        houseBuilder.buildwalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
