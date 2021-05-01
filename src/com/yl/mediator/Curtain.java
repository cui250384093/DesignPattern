package com.yl.mediator;

/**
 * @author candk
 * @Description
 * @date 5/1/21 - 10:26 AM
 */
public class Curtain extends Colleague {

    public Curtain(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(int stateChange) {

    }
}
