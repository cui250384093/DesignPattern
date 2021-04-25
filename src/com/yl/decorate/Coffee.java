package com.yl.decorate;

/**
 * @author candk
 * @Description
 * @date 4/25/21 - 11:07 AM
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
