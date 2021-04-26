package com.yl.facade;

import javax.script.ScriptEngine;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 9:54 AM
 */
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Screen up.");
    }

    public void down() {
        System.out.println("Screen down.");
    }

    public void focus() {
        System.out.println("Screen focus.");
    }
}
