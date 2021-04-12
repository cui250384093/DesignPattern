package com.yl.singleton;

/**
 * @author candk
 * @Description
 * @date 4/12/21 - 2:25 PM
 */
public class SingletonTest1 {

}


/**
 * 饿汉式
 * 优点：在类加载时就完成实例化，避免线程同步问题
 * 缺点：在类加载时就完成实例化，没有达到lazy loading的效果。可能造成内存浪费
 */
class Singleton1 {

    private final static Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}