package com.yl.responsibilitychain;

import com.yl.proxy.Approver;

/**
 * @author candk
 * @Description
 * @date 5/6/21 - 3:28 PM
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
        if (request.getPrice() < 20000.0f) {
            System.out.println("id = " + request.getId() + " 被 " + this.getName() + " 处理。");
        } else {
            this.getApprover().processRequest(request);
        }
    }
}
