package com.yl.visitor;

/**
 * @author candk
 * @Description
 * @date 4/30/21 - 8:26 AM
 */
public abstract class Person {

    public abstract void accept(Action action);
}
