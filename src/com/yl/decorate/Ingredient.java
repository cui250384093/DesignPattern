package com.yl.decorate;

/**
 * @author candk
 * @Description
 * @date 4/25/21 - 11:09 AM
 */
public class Ingredient extends Drink {

    Drink drink;

    public Ingredient(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " " + super.getPrice() + " && " + drink.getDes();
    }
}
