package com.yl.facade;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 9:56 AM
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Stereo on.");
    }

    public void off() {
        System.out.println("Stereo off.");
    }

    public void volumeUp() {
        System.out.println("Stereo volume up.");
    }

    public void volumeDown() {
        System.out.println("Stereo volume down.");
    }
}
