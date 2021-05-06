package com.yl.responsibilitychain;

/**
 * @author candk
 * @Description
 * @date 5/6/21 - 3:25 PM
 */
public class Request {

    private int type;
    private int number;
    private float price;
    private int id;
    private static int temp;

    public Request(int type, int number, float price) {
        this.type = type;
        this.number = number;
        this.price = price;
        temp++;
        id = temp;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }
}
