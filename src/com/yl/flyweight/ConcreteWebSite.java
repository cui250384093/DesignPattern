package com.yl.flyweight;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 3:39 PM
 */
public class ConcreteWebSite extends WebSite {

    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    protected void use() {
        System.out.println("网站的发布形式为：" + type);
    }
}
