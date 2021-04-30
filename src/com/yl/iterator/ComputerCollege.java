package com.yl.iterator;

import java.util.Iterator;

/**
 * @author candk
 * @Description
 * @date 4/30/21 - 10:08 AM
 */
public class ComputerCollege implements College {

    String name;
    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege(String name) {
        this.name = name;
        departments = new Department[5];
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[numOfDepartment++] = new Department(name, desc);
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
