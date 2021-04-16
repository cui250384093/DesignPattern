package com.yl.builder.improve;

/**
 * @author candk
 * @Description
 * @date 4/16/21 - 9:01 AM
 */
public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();

        HighHouse highHouse = new HighHouse();
        houseDirector.setHouseBuilder(highHouse);
        houseDirector.constructHouse();
    }
}
