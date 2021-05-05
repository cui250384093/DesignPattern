package com.yl.state;

/**
 * @author candk
 * @Description
 * @date 5/5/21 - 9:31 AM
 */
public class Client {

    public static void main(String[] args) {
        Activity activity = new Activity(1);

        for (int i = 0; i < 30; i++) {
            System.out.println("第" + (i + 1) + "次抽奖");
            activity.deduceMoney();
            activity.raffle();
        }
    }
}
