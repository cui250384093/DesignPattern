package com.yl.proxy;

/**
 * @author candk
 * @Description
 * @date 4/27/21 - 8:48 AM
 */
public class Client {
    public static void main(String[] args) {
        TeacherDAO target = new TeacherDAO();
        ITeacherDAO proxyInstance = (ITeacherDAO) new ProxyFactory(target).getProxyInstance();

        proxyInstance.teach();
        proxyInstance.sleep();

    }
}
