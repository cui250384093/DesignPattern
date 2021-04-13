package com.yl.absfactory.pizzastore;

/**
 * @author candk
 * @Description
 * @date 4/13/21 - 3:32 PM
 */
public class LDPepperPizza extends Pizza {

    public LDPepperPizza() {
        setName("London Pepper Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Prepare ingredients for " + this.name);
    }
}
