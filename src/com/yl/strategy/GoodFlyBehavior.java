package com.yl.strategy;

/**
 * @author candk
 * @Description
 * @date 5/6/21 - 2:27 PM
 */
public class GoodFlyBehavior implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("Fly Good!");
    }
}
