package com.yl.visitor;

/**
 * @author candk
 * @Description
 * @date 4/30/21 - 8:26 AM
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
