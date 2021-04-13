package com.yl.absfactory.pizzastore;


/**
 * @author candk
 * @Description
 * @date 4/13/21 - 4:15 PM
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType) {
            case "cheese" :
                pizza = new LDCheesePizza();
                return pizza;
            case "pepper" :
                pizza = new LDPepperPizza();
                return pizza;
            default:
                return null;
        }
    }
}
