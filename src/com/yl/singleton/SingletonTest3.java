package com.yl.singleton;

/**
 * @author candk
 * @Description
 * @date 4/12/21 - 2:37 PM
 */
public class SingletonTest3 {

}

/**
 * 懒汉式 - 线程不安全
 * 1. 起到了lazy loading的效果，但是只能在单线程下使用
 * 2. 如果在多线程下，一个线程进入了if（singleton == null）判断语句块，还没来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 * 实际开发中不要使用这种方式。
 */
class Singleton3 {
    private static Singleton3 INSTANCE;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }

        return INSTANCE;
    }
}
