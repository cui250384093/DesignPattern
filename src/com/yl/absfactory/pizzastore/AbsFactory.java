package com.yl.absfactory.pizzastore;

/**
 * @author candk
 * @Description 抽象工厂模式的接口
 * @date 4/13/21 - 4:11 PM
 */
public interface AbsFactory {

    /**
     * 抽象
     * @return
     */
    public Pizza createPizza(String orderType);
}
