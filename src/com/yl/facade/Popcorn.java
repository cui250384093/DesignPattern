package com.yl.facade;

import java.sql.PreparedStatement;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 9:52 AM
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Popcorn on.");
    }

    public void off() {
        System.out.println("Popcorn off.");
    }

    public void pop() {
        System.out.println("Popcorn is poping.");
    }
}
