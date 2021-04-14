package com.yl.prototype;

/**
 * @author candk
 * @Description
 * @date 4/14/21 - 10:15 AM
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Lily", 21, "white");
        Sheep sheep1 = sheep.clone();

        System.out.println(sheep1);
    }
}
