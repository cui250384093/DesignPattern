package com.yl.proxy.cglib;

/**
 * @author candk
 * @Description
 * @date 4/27/21 - 10:13 AM
 */
public class Client {

    public static void main(String[] args) {

        TeacherDAO target = new TeacherDAO();
        TeacherDAO proxyInstance = (TeacherDAO) new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
    }
}
