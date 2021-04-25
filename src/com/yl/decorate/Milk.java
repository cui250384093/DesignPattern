package com.yl.decorate;

/**
 * @author candk
 * @Description
 * @date 4/25/21 - 1:57 PM
 */
public class Milk extends Ingredient {
    public Milk(Drink drink) {
        super(drink);
        setDes("Milk");
        setPrice(2.0f);
    }
}
