package com.yl.strategy;

/**
 * @author candk
 * @Description
 * @date 5/6/21 - 2:28 PM
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new CouldQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("BeiJing duck");
    }
}
