package com.yl.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author candk
 * @Description
 * @date 4/30/21 - 10:06 AM
 */
public class InfoCollegeIterator implements Iterator<Department> {

    List<Department> departments;
    int index = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        } else {
            index++;
            return true;
        }
    }

    @Override
    public Department next() {
        return departments.get(index);
    }
}
