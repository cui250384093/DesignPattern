package com.yl.singleton;

/**
 * @author candk
 * @Description
 * @date 4/12/21 - 2:52 PM
 */
public class SingletonTest5 {
}

/**
 * 懒汉式 - 线程安全 双重检查
 *
 */
class Singleton5 {
    private static volatile Singleton5 INSTANCE;
    private Singleton5() {}

    public static Singleton5 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton5.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton5();
                }
            }
        }

        return INSTANCE;
    }
}