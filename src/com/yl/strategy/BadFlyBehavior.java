package com.yl.strategy;

/**
 * @author candk
 * @Description
 * @date 5/6/21 - 2:28 PM
 */
public class BadFlyBehavior implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("Bad Fly!");
    }
}
