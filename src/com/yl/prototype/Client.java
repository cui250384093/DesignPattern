package com.yl.prototype;

/**
 * @author candk
 * @Description 原型模式
 * 1. 浅拷贝
 *  对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象。
 *  对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象，那么浅拷贝会进行引用传递，也就是只是将该成员变量的引用值（内存地址）
 *  复制一份给新对象，因为实际上两个对象的该成员变量都指向同一实例。在这种情况下，在一个对象中修改该成员变量会影响另一个对象的该成员变量值。
 *  浅拷贝使用默认的clone()方法来实现。
 *  sheep = (Sheep)super.clone();
 * 2. 深拷贝
 *  复制对象的所有基本数据类型的成员变量值
 *  为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该成员对象可达的所有对象。也就是说，对象进行深拷贝要对
 *  整个对象进行拷贝。
 *  深拷贝通过对象序列化实现。
 *
 * @date 4/14/21 - 10:15 AM
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep1 = new Sheep("Lily", 21, "white");
        Sheep sheep2 = new Sheep("Lucy", 21, "black");
        sheep1.setFriend(sheep2);
        Sheep sheep3 = sheep1.deepClone();

        System.out.println(sheep1.getFriend().hashCode());
        System.out.println(sheep3.getFriend().hashCode());
    }
}
