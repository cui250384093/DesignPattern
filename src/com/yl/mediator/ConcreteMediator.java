package com.yl.mediator;

import java.util.HashMap;

/**
 * @author candk
 * @Description
 * @date 5/1/21 - 10:23 AM
 */
public class ConcreteMediator extends Mediator {

    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtain) {
            interMap.put("Curtain", colleagueName);
        }
    }

    /**
     * 具体中介者的核心方法
     * 1. 根据得到信息，完成对应任务
     * 2. 中介者在这个方法中，协调各个具体的同事对象，完成任务
     * @param stateChange
     * @param ColleagueName
     */
    @Override
    public void getMessage(int stateChange, String ColleagueName) {
        if (colleagueMap.get(colleagueMap) instanceof CoffeeMachine) {
            System.out.println("Coffee Machine");
        }
    }

    @Override
    public void sendMessage() {

    }
}
