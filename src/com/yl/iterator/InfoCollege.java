package com.yl.iterator;

import java.util.*;

/**
 * @author candk
 * @Description
 * @date 4/30/21 - 10:09 AM
 */
public class InfoCollege implements College {

    private String name;
    List<Department> departments;

    public InfoCollege(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments.add(new Department(name, desc));
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
