package com.yl.strategy;

/**
 * @author candk
 * @Description
 * @date 5/6/21 - 2:28 PM
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();
}
