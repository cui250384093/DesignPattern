package com.yl.singleton;

/**
 * @author candk
 * @Description
 * @date 4/12/21 - 2:44 PM
 */
public class SingletonTest4 {

}

/**
 * 懒汉式 - 线程安全
 * 提供一个静态的同步方法，加入同步处理的代码，解决线程安全问题
 * 缺点：效率太低，每个线程在获得类的实例时，执行getInstance（）方法都要进行同步，而其实这个方法只执行一次实例化就够了，后面向获得该类实例，直接return即可。
 * 实际中不推荐这种方式。
 */
class Singleton4 {
    private static Singleton4 INSTANCE;

    private Singleton4() {}

    public static synchronized Singleton4 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton4();
        }

        return INSTANCE;
    }
}