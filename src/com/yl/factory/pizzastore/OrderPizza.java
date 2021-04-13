package com.yl.factory.pizzastore;

import java.io.*;

/**
 * @author candk
 * @Description
 * @date 4/13/21 - 2:17 PM
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            switch (orderType) {
                case "greek" :
                    pizza = new GreekPizza();
                    break;
                case "chess" :
                    pizza = new ChessPizza();
                    break;
                default:
                    break;
            }
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
