package com.yl.observer;

/**
 * @author candk
 * @Description
 * @date 5/1/21 - 8:44 AM
 */
public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentObserver currentObserver = new CurrentObserver();
        weatherData.registerObserver(currentObserver);
        weatherData.setData(10.0f, 20.0f, 30.1f);
    }
}
