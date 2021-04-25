package com.yl.decorate;

/**
 * @author candk
 * @Description 装饰者模式，动态的将新功能附加到对象上，在对象功能扩展方面，它比继承更有弹性，装饰者模式也体现了ocp
 * @date 4/25/21 - 10:57 AM
 */
public abstract class Drink {

    public String des;
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();

}
