package com.yl.iterator;

import java.util.Iterator;

/**
 * @author candk
 * @Description
 * @date 4/30/21 - 10:07 AM
 */
public interface College {

    public String getName();

    public void addDepartment(String name, String desc);

    public Iterator createIterator();
}
