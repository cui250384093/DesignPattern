package com.yl.proxy;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 4:14 PM
 */
public class ProxyDes {
    /**
     * 代理模式：为一个对象提供一个替身，以控制对这个对象的访问，即通过代理对象访问目标对象，这样做的好处是：可以在目标对象实现的基础上，增强额外的功能操作，
     * 即扩展目标对象的功能
     * 被代理的对象可以是远程对象，创建开销大的对象或需要安全控制的对象
     * 代理模式有三种不同的形式：静态代理、动态代理（JDK代理，接口代理）、cglib代理（可以在内存中动态的创建对象，而不需要实现接口）
     *
     * 静态代理
     * 优点：在不修改目标对象的功能前提下，能通过代理对象对目标功能扩展
     * 缺点：因为代理对象需要与目标对象实现一样的接口，所以会有很多代理类
     * 一旦接口增加方法，目标对象和代理对象都要维护
     *
     * 动态代理
     *
     *
     * cglib代理
     *
     */
}
