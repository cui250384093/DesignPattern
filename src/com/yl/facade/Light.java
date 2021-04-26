package com.yl.facade;

import java.io.ObjectOutputStream;
import java.util.List;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 9:58 AM
 */
public class Light {

    private static Light instance = new Light();

    public static Light getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Light on.");
    }

    public void off() {
        System.out.println("light off.");
    }

    public void dim() {
        System.out.println("light dim.");
    }

    public void bright() {
        System.out.println("Light bright.");
    }
}
