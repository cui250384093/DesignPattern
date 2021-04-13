package com.yl.factory.pizzastore;

/**
 * @author candk
 * @Description
 * @date 4/13/21 - 2:15 PM
 */
public class ChessPizza extends Pizza {

    public ChessPizza() {
    }

    public ChessPizza(String name) {
        this.name = name;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare ingredients for chess pizza.");
    }
}
