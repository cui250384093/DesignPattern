package com.yl.decorate;

/**
 * @author candk
 * @Description
 * @date 4/25/21 - 1:57 PM
 */
public class Soy extends Ingredient {

    public Soy(Drink drink) {
        super(drink);
        setDes("Soy");
        setPrice(1.0f);
    }
}
