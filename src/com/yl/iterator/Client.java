package com.yl.iterator;

import java.util.ArrayList;

/**
 * @author candk
 * @Description
 * @date 4/30/21 - 11:08 AM
 */
public class Client {

    public static void main(String[] args) {
        ArrayList<College> colleges = new ArrayList<>();
        ComputerCollege cc = new ComputerCollege("Computer College");
        cc.addDepartment("department1", "");
        cc.addDepartment("department2", "");
        colleges.add(cc);

        InfoCollege ic = new InfoCollege("Info College");
        ic.addDepartment("department3", "");
        ic.addDepartment("department4", "");

        colleges.add(ic);

        OutputImpl output = new OutputImpl(colleges);
        output.printCollege();
    }
}
