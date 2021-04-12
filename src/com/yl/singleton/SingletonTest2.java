package com.yl.singleton;

/**
 * @author candk
 * @Description
 * @date 4/12/21 - 2:31 PM
 */
public class SingletonTest2 {

}

/**
 * 饿汉式（静态代码块）
 */
class Singleton2 {

    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    private Singleton2() {

    }
}
