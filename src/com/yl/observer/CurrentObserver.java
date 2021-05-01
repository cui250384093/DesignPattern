package com.yl.observer;

/**
 * @author candk
 * @Description
 * @date 5/1/21 - 8:43 AM
 */
public class CurrentObserver implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("温度： " + temperature);
        System.out.println("压力： " + pressure);
        System.out.println("湿度： " + humidity);
    }
}
