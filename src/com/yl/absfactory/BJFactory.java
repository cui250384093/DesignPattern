package com.yl.absfactory;

/**
 * @author candk
 * @Description
 * @date 4/13/21 - 4:13 PM
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        switch (orderType) {
            case "cheese" :
                pizza = new BJCheesePizza();
                return pizza;
            case "pepper" :
                pizza = new BJPepperPizza();
                return pizza;
            default:
                return null;
        }
    }
}
