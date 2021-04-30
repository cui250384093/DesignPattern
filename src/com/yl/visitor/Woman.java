package com.yl.visitor;

/**
 * @author candk
 * @Description
 * @date 4/30/21 - 8:26 AM
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
