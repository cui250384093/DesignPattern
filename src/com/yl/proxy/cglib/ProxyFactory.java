package com.yl.proxy.cglib;

import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * @author candk
 * @Description
 * @date 4/27/21 - 10:12 AM
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        Object returnVal = method.invoke(target, objects);

        return returnVal;
    }
}
