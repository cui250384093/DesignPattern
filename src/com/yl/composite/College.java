package com.yl.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 8:31 AM
 */
public class College extends Component {

    List<Component> components = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void print() {
        System.out.println(super.getName() + "  " + super.getDes());
        System.out.print("\t");
        for (Component component : components) {
            component.print();
        }
    }
}
