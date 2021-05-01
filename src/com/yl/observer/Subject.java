package com.yl.observer;

/**
 * @author candk
 * @Description
 * @date 5/1/21 - 8:40 AM
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
