package com.yl.state;

/**
 * @author candk
 * @Description
 * @date 5/5/21 - 8:49 AM
 */
public class DispenseOutState implements State {

    Activity activity;

    public DispenseOutState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品发完了！");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发完了！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发完了！");
    }
}
