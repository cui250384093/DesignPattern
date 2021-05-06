package com.yl.proxy;

import com.yl.responsibilitychain.Request;

/**
 * @author candk
 * @Description
 * @date 5/6/21 - 3:27 PM
 */
public abstract class Approver {

    String name;
    Approver approver;

    public Approver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void processRequest(Request request);
}
