package com.yl.proxy;

import java.lang.reflect.*;

/**
 * @author candk
 * @Description
 * @date 4/27/21 - 8:37 AM
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 生成代理对象
     * @return
     */
    public Object getProxyInstance() {

        /**
         * 1. ClassLoader loader : 指定目标对象使用的类加载器，获取加载器的方法固定
         * 2. Class<?>[] interfaces : 目标对象实现的接口类型，使用泛型的方法确认类型
         * 3. InvocationHandler h : 事情处理，执行目标对象的方法时，会触发事情处理器方法，会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object returnVal = method.invoke(target, args);
                return returnVal;
            }
        });
    }
}
