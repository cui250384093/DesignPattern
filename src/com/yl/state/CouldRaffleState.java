package com.yl.state;

import java.util.Random;

/**
 * @author candk
 * @Description
 * @date 5/5/21 - 8:48 AM
 */
public class CouldRaffleState implements State {

    Activity activity;

    public CouldRaffleState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("积分已经扣过了！");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖！");
        Random random = new Random();
        int num = random.nextInt(10);
        if (0 == num) {
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有中奖！");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品！");
    }
}
