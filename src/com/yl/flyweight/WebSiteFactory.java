package com.yl.flyweight;

import java.util.HashMap;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 3:39 PM
 */
public class WebSiteFactory {

    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }

        return (WebSite) pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }
}
