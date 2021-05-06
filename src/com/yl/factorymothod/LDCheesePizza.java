package com.yl.factorymothod;

/**
 * @author candk
 * @Description
 * @date 4/13/21 - 2:15 PM
 */
public class LDCheesePizza extends Pizza {

    public LDCheesePizza() {
        setName("London cheese Pizza");
    }


    @Override
    public void prepare() {
        System.out.println("Prepare ingredients for" + this.name);
    }
}
