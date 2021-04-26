package com.yl.facade;

import java.sql.PreparedStatement;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 9:49 AM
 */
public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD on.");
    }

    public void off() {
        System.out.println("DVD off.");
    }

    public void play() {
        System.out.println("DVD play.");
    }

    public void pause() {
        System.out.println("DVD paused.");
    }
}
