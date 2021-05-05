package com.yl.state;

/**
 * @author candk
 * @Description 不能抽奖的状态
 * @date 5/5/21 - 8:47 AM
 */
public class NoRaffleState implements State {

    Activity activity;

    public NoRaffleState(Activity activity) {
        this.activity = activity;
    }


    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分成功，可以抽奖了！");
        activity.setState(activity.getCouldRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖哦！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品！");
    }
}
