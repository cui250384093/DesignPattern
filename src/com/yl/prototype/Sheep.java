package com.yl.prototype;

/**
 * @author candk
 * @Description 原型模式
 * @date 4/14/21 - 10:11 AM
 */
public class Sheep implements Cloneable {

    private String name;
    private int age;
    private String color;

    public Sheep() {
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     * 克隆该实例，使用默认的clone方法来实现
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }
}
