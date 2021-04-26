package com.yl.composite;

/**
 * @author candk
 * @Description
 * @date 4/26/21 - 8:31 AM
 */
public class Client {

    public static void main(String[] args) {
        University university = new University("HuNanUniversity", "Home University");

        College elec = new College("Elec", "");
        College mach = new College("Mach", "");

        Department dep1 = new Department("Automation", "");
        Department dep2 = new Department("Elec Automation", "");

        elec.add(dep1);
        elec.add(dep2);

        university.print();
    }
}
