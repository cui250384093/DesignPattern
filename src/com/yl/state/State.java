package com.yl.state;

/**
 * @author candk
 * @Description
 * @date 5/5/21 - 8:46 AM
 */
public interface State {

    /**
     * 扣除积分
     */
    public void deduceMoney();

    /**
     * 是否抽中奖品
     * @return
     */
    public boolean raffle();

    /**
     * 发放奖品
     */
    public void dispensePrize();
}
