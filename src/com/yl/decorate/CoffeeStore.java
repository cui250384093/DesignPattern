package com.yl.decorate;

/**
 * @author candk
 * @Description
 * @date 4/25/21 - 1:58 PM
 */
public class CoffeeStore {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        order = new Milk(order);
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);

        System.out.println(order.getDes());
        System.out.println(order.cost());
    }
}
