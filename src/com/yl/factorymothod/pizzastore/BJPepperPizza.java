package com.yl.factorymothod.pizzastore;

/**
 * @author candk
 * @Description
 * @date 4/13/21 - 3:32 PM
 */
public class BJPepperPizza extends Pizza {

    public BJPepperPizza() {
        setName("BeiJing Pepper Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Prepare ingredients for " + this.name);
    }
}
