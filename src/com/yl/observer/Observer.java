package com.yl.observer;

/**
 * @author candk
 * @Description
 * @date 5/1/21 - 8:41 AM
 */
public interface Observer {

    String name = "";

    public void update(float temperature, float pressure, float humidity);
}
