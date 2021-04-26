package com.yl.composite;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 8:28 AM
 */
public abstract class Component {

    private String name;
    private String des;

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public Component(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public abstract void print();
}
