package com.yl.strategy;

/**
 * @author candk
 * @Description
 * @date 5/6/21 - 2:29 PM
 */
public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new CouldQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("wild duck");
    }
}
