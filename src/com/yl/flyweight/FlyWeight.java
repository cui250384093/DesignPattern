package com.yl.flyweight;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 3:16 PM
 */
public class FlyWeight {
    /**
     * 享元模式（flyweight pattern）也叫蝇量模式，运用共享技术有效的支持大量细粒度的对象
     * 常用与系统底层开放，解决系统的性能问题，像数据连接池，里面都是创建好的连接对象，在这些连接对象中有我们需要的则直接拿来用，避免重复创建，没有则创建一个
     * 享元模式可以解决对象的内存浪费问题，当系统中有大量相似对象，需要缓冲池时，不需要总是创建新对象，可以从缓冲池里拿，降低系统内存，提高效率
     * 享元模式经典的应用场景就是池技术了。
     * 享元模式提高了系统的复杂度，需要分离出内部状态和外部状态，而外部状态具有固化特性，不应该随着内部状态的改变而改变，这是使用享元模式需要注意的地方。
     *
     */
}