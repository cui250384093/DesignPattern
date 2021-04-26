package com.yl.flyweight;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 3:46 PM
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite1 = factory.getWebSite("news");
        WebSite webSite2 = factory.getWebSite("news");
        webSite1.use();
        webSite2.use();
        System.out.println(factory.getWebSiteCount());
        System.out.println(webSite1 == webSite2);
        WebSite webSite3 = factory.getWebSite("blogs");
        System.out.println(factory.getWebSiteCount());
    }
}
