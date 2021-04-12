package com.yl.singleton;

/**
 * @author candk
 * @Description
 * @date 4/12/21 - 3:02 PM
 */
public class SingletonTest6 {
}

/**
 * 懒汉式
 * 静态内部类在被装载时并不会立即实例化，而是在需要实例化时，调用getInstance（）方法，才会装载内部类，从而完成Singleton6的实例化
 * 类的静态属性只会在第一次加载类的时候初始化，所以JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程时无法进入的。
 * 优点：避免了线程不安全，利用静态内部类特点实现了延迟加载，效率高。
 * 推荐使用
 */
class Singleton6 {

    private Singleton6() {}

    private static class SingletonInstance {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static synchronized Singleton6 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
