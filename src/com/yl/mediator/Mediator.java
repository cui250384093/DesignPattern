package com.yl.mediator;

/**
 * @author candk
 * @Description
 * @date 5/1/21 - 10:23 AM
 */
public abstract class Mediator {

    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMessage(int stateChange, String ColleagueName);

    public abstract void sendMessage();
}
