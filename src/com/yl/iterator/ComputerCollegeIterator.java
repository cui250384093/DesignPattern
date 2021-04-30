package com.yl.iterator;

import java.util.Iterator;

/**
 * @author candk
 * @Description
 * @date 4/30/21 - 10:06 AM
 */
public class ComputerCollegeIterator implements Iterator<Department> {

    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {

        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Department next() {
        return departments[position++];
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
