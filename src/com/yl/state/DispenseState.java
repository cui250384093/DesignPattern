package com.yl.state;

/**
 * @author candk
 * @Description
 * @date 5/5/21 - 8:48 AM
 */
public class DispenseState implements State {

    Activity activity;

    public DispenseState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("不能扣除积分！");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖！");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖！");
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品发送完了！");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
