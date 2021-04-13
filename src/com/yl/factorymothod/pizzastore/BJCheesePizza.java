package com.yl.factorymothod.pizzastore;

/**
 * @author candk
 * @Description
 * @date 4/13/21 - 2:15 PM
 */
public class BJCheesePizza extends Pizza {

    public BJCheesePizza() {
        setName("BeiJing Chess Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Prepare ingredients for " + this.name);
    }
}
