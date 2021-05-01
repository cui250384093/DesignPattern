package com.yl.mediator;

/**
 * @author candk
 * @Description
 * @date 5/1/21 - 10:27 AM
 */
public class TV extends Colleague {


    public TV(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(int stateChange) {

    }
}
