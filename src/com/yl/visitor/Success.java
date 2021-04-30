package com.yl.visitor;

/**
 * @author candk
 * @Description
 * @date 4/30/21 - 8:25 AM
 */
public class Success extends Action{

    @Override
    public void getManResult(Man man) {
        System.out.println("Man commends success");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Woman commends success");
    }
}
