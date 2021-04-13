package com.yl.factory.pizzastore;

/**
 * @author candk
 * @Description
 * @date 4/13/21 - 2:16 PM
 */
public class GreekPizza extends Pizza{

    public GreekPizza() {
    }

    public GreekPizza(String name) {
        this.name = name;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare ingredients for greek pizza.");
    }
}
