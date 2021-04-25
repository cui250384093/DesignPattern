package com.yl.decorate;

/**
 * @author candk
 * @Description
 * @date 4/25/21 - 1:42 PM
 */
public class Chocolate extends Ingredient {

    public Chocolate(Drink drink) {
        super(drink);
        setDes("Chocolate");
        setPrice(3.0f);
    }
}
