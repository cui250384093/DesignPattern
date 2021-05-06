package com.yl.responsibilitychain;

import com.yl.proxy.Approver;

/**
 * @author candk
 * @Description
 * @date 5/6/21 - 3:29 PM
 */
public class SchoolApprover extends Approver {

    public SchoolApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
            System.out.println("id = " + request.getId() + " 被 " + this.getName() + " 处理。");
    }
}
