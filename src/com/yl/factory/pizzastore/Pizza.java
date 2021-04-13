package com.yl.factory.pizzastore;

/**
 * @author candk
 * @Description
 * @date 4/13/21 - 2:12 PM
 */
public abstract class Pizza {
    protected String name;

    /**
     * 准备原材料，不同披萨原材料不同
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "is baking.");
    }

    public void cut() {
        System.out.println(name + "is cutting.");
    }

    public void box() {
        System.out.println(name + "is boxing.");
    }

    public void setName(String name) {
        this.name = name;
    }
}
