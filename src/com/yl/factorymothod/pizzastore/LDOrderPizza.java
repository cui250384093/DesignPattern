package com.yl.factorymothod.pizzastore;

/**
 * @author candk
 * @Description
 * @date 4/13/21 - 3:46 PM
 */
public class LDOrderPizza extends OrderPizza {



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
