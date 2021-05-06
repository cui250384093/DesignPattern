package com.yl.strategy;

/**
 * @author candk
 * @Description
 * @date 5/6/21 - 2:29 PM
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
        quackBehavior = new NoQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("Toy Duck");
    }
}
