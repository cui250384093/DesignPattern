package com.yl.factorymothod;

import java.io.*;

/**
 * @author candk
 * @Description
 * @date 4/13/21 - 3:37 PM
 */
public abstract class OrderPizza {

    /**
     * 工厂子类实现
     * @param orderType
     * @return
     */
    public abstract Pizza createPizza(String orderType);

    public void order() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input the pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
