package com.yl.strategy;

/**
 * @author candk
 * @Description
 * @date 5/6/21 - 2:41 PM
 */
public class Client {

    public static void main(String[] args) {
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.flyBehavior.fly();
    }
}
