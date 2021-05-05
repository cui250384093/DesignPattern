package com.yl.state;

/**
 * @author candk
 * @Description
 * @date 5/5/21 - 8:49 AM
 */
public class Activity {

    State state;
    int count;

    State noRaffleState = new NoRaffleState(this);
    State couldRaffleState = new CouldRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    public Activity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    public void deduceMoney() {
        state.deduceMoney();
    }

    public void raffle() {
        if (state.raffle()) {
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCouldRaffleState() {
        return couldRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }
}
